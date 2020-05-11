package threadlocal;

/**
 * Created by iyoungman on 2020-05-11.
 */

public class Main {

    public static void main(String[] args) {
        A a = new A();
        a.set(10);

        B b = new B();
        System.out.println(b.get());//10

        C c = new C();
        c.remove();
        System.out.println(b.get());//NullPointerException
    }
}

