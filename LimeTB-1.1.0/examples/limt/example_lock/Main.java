package example_lock;

import fi.hut.ics.lime.tester.LCT;

public class Main {
	public static void main(String[] args) {
		Lock lock = new LockImpl();
		lock.lock();
    lock.unlock();
    lock.lock();

		SetterLock sLock = new SetterLockImpl();
		sLock.setLocked(true);
		sLock.setLocked(false);
	}
}
