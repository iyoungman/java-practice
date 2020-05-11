package threadlocal;

/**
 * Created by iyoungman on 2020-05-12.
 */

class C {

    void remove() {
        Context.local.remove();
    }
}
