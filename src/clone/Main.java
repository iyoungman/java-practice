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
        shallowCopy.setValue("Hello3");
        System.out.println(two.getValue() + " " + shallowCopy.getValue());
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

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

class Two {

    private String value;

    public Two(String value) {
        this.value = value;
    }
}
