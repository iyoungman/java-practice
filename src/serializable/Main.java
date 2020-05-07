package serializable;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by iyoungman on 2020-05-07.
 */

public class Main {

    private static File file = new File("./src/serializable/TEST_FILE");;

    public static void main(String[] args) {
        conductSerializing();
        conductDeserializing();
    }

    public static void conductSerializing() {
        try {

            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(bos);
            Person person = new Person("iyoungman", "27");
            out.writeObject(person);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void conductDeserializing() {
        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream in = new ObjectInputStream(bis);
            Person person = (Person) in.readObject();

            System.out.println(person.toString());
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}