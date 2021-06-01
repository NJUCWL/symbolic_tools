package tests;
import janala.Main;
/**
 * @author chenwenlong <chenwenlong@kuaishou.com>
 * Created on 2021-05-08
 */

/**
 * @ClassName: MyTest
 * @Description TODO
 * @Author:
 * @Date: 2021/5/8 下午11:35
 * @Version" 1.0
 */
public class MyTest {
    public static void main(String[] args) {
        int a=Main.readInt(4);
        Main.MakeSymbolic(a);
        int b=Main.readInt(2);
        Main.MakeSymbolic(b);
        System.out.println(test(a,b));

    }
    public static int test(int a, int b){
        int c;
        if(a>b){
            c = a+b;
            if(c%2==0){
                c++;
            }else {
                c--;
            }
        }else {
            c = a-b;
        }
        return c;
    }
}
