package reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by iyoungman on 2020-05-07.
 */

public class Tutorial {

    public static void main(String[] args) {
        Object person = new Person();
        Field[] fields = person.getClass().getDeclaredFields();

        List<String> actualFieldNames = getFieldNames(fields);
        System.out.println(actualFieldNames.toString());//name, age
    }

    private static List<String> getFieldNames(Field[] fields) {
        List<String> fieldNames = new ArrayList<>();
        for (Field field : fields) {
            fieldNames.add(field.getName());
        }
        return fieldNames;
    }
}

class Person {

    private String name;
    private int age;
}
