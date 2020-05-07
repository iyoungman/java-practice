package serializable;

import java.io.Serializable;

/**
 * Created by iyoungman on 2020-05-07.
 */

public class Person implements Serializable {

    private static final long serialVersionUID = -5496450872578488311L;

    private String name;
    private String age;
    private String id;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
