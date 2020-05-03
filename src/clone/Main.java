package clone;

/**
 * Created by iyoungman on 2020-05-02.
 */

public class Main {

    public static void main(String[] args) throws Exception {
        One one = new One("Hello");
        One deepCopy = (One) one.clone();
        System.out.println(one == deepCopy);

        One two = new One("Hello2");
        One shallowCopy = two;
        System.out.println(two == shallowCopy);
    }
}

class One implements Cloneable {

    private String value;

    public One(String value) {
        this.value = value;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Two {

    private String value;

    public Two(String value) {
        this.value = value;
    }
}
