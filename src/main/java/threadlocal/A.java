package threadlocal;

/**
 * Created by iyoungman on 2020-05-12.
 */

class A {

    void set(int num) {
        Context.local.set(num);
    }
}

