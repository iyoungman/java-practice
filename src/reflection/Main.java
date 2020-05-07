package reflection;

/**
 * Created by iyoungman on 2020-05-06.
 */

@Iyoungman(name = "Lee", age = 270)
public class Main {

    public static void main(String[] args) {
        Iyoungman annotation = Main.class.getDeclaredAnnotation(Iyoungman.class);

        System.out.println(annotation.name());//Lee
        System.out.println(annotation.age());//270
    }

}
