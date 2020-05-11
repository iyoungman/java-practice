package threadlocal;

/**
 * Created by iyoungman on 2020-05-12.
 */

class B {

    int get() {
        return Context.local.get();
    }
}
