/*  Boolector: Satisfiablity Modulo Theories (SMT) solver.
 *
 *  Copyright (C) 2007-2009 Robert Daniel Brummayer.
 *  Copyright (C) 2007-2012 Armin Biere.
 *
 *  All rights reserved.
 *
 *  This file is part of Boolector.
 *  See COPYING for more information on using this software.
 */

#include "btorhash.h"

static unsigned
btor_hash_ptr (const void * p)
{
  return 1183477 * (unsigned)(unsigned long) p;
}

static int
btor_cmp_ptr (const void * p, const void * q)
{
  return ((long)p) - ((long)q);
}

BtorPtrHashTable *
btor_new_ptr_hash_table (BtorMemMgr * mem, BtorHashPtr hash, BtorCmpPtr cmp)
{
  BtorPtrHashTable * res;

  BTOR_NEW (mem, res);
  BTOR_CLR (res);

  res->mem = mem;
  res->hash = hash ? hash : btor_hash_ptr;
  res->cmp = cmp ? cmp : btor_cmp_ptr;

  return res;
}

void
btor_delete_ptr_hash_table (BtorPtrHashTable * p2iht)
{
  BtorPtrHashBucket * p, * next;

  for (p = p2iht->first; p; p = next)
    {
      next = p->next;
      BTOR_DELETE (p2iht->mem, p);
    }

  BTOR_DELETEN (p2iht->mem, p2iht->table, p2iht->size);
  BTOR_DELETE (p2iht->mem, p2iht);
}

static void
btor_enlarge_ptr_hash_table (BtorPtrHashTable * p2iht)
{
  BtorPtrHashBucket * p, * chain, ** old_table, ** new_table;
  unsigned old_size, new_size, i, h;
  BtorHashPtr hash;

  old_size = p2iht->size;
  old_table = p2iht->table;

  new_size = old_size ? 2 * old_size : 1;
  BTOR_CNEWN (p2iht->mem, new_table, new_size);

  hash = p2iht->hash;

  for (i = 0; i < old_size; i++)
    for (p = old_table[i]; p; p = chain)
      {
	chain = p->chain;
	h = hash (p->key);
	h &= new_size - 1;
	p->chain = new_table[h];
	new_table[h] = p;
      }

  BTOR_DELETEN (p2iht->mem, old_table, old_size);

  p2iht->size = new_size;
  p2iht->table = new_table;
}

static BtorPtrHashBucket **
btor_findpos_in_ptr_hash_table_pos (BtorPtrHashTable * p2iht, void * key)
{
  BtorPtrHashBucket ** p, * b;
  unsigned h;

  if (p2iht->count == p2iht->size)
    btor_enlarge_ptr_hash_table (p2iht);

  assert (p2iht->size > 0);

  h = p2iht->hash (key);
  h &= p2iht->size - 1;

  for (p = p2iht->table + h;
       (b = *p) && p2iht->cmp (b->key, key);
       p = &b->chain)
    ;

  return p;
}

BtorPtrHashBucket *
btor_find_in_ptr_hash_table (BtorPtrHashTable * p2iht, void *key)
{
  return *btor_findpos_in_ptr_hash_table_pos (p2iht, key);
}

BtorPtrHashBucket *
btor_insert_in_ptr_hash_table (BtorPtrHashTable * p2iht, void * key)
{
  BtorPtrHashBucket ** p, * res;
  p = btor_findpos_in_ptr_hash_table_pos (p2iht, key);
  assert (!*p);
  BTOR_CNEW (p2iht->mem, res);
  res->key = key;
  *p = res;
  p2iht->count++;

  res->prev = p2iht->last;

  if (p2iht->first)
    p2iht->last->next = res;
  else
    p2iht->first = res;

  p2iht->last = res;

  return res;
}

static unsigned btor_hash_primes[] = {
  111130391, 22237357, 33355519, 444476887
};

#define BTOR_HASH_PRIMES ((sizeof btor_hash_primes)/sizeof *btor_hash_primes)

unsigned
btor_hashstr (const void * str)
{
  const char * p = (const char *) str;
  unsigned res, i;
  char ch;

  i = 0;
  res = 0;

  while ((ch = *p++))
    {
      res += btor_hash_primes[i++] * (unsigned) ch;
      if (i == BTOR_HASH_PRIMES)
	i = 0;
    }

  return res;
}

void
btor_remove_from_ptr_hash_table (BtorPtrHashTable * table,
				 void * key,
				 void ** stored_key_ptr,
				 BtorPtrHashData * stored_data_ptr)
{
  BtorPtrHashBucket ** p, * bucket;

  p = btor_findpos_in_ptr_hash_table_pos (table, key);
  bucket = *p;

  assert (bucket);
  *p = bucket->chain;

  if (bucket->prev)
    bucket->prev->next = bucket->next;
  else
    table->first = bucket->next;

  if (bucket->next)
    bucket->next->prev = bucket->prev;
  else
    table->last = bucket->prev;

  assert (table->count > 0);
  table->count--;

  if (stored_key_ptr)
    *stored_key_ptr = bucket->key;

  if (stored_data_ptr)
    *stored_data_ptr = bucket->data;

  BTOR_DELETE (table->mem, bucket);
}
