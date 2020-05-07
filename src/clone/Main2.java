package clone;

/**
 * Created by iyoungman on 2020-05-05.
 */

public class Main2 {

    public static void main(String[] args) {
        String one = "Test1";
        String two = "Test2";
        two = one;

        two = "Test3";

        System.out.println(one);
        System.out.println(two);
    }

}
