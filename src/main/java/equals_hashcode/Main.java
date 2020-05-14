package equals_hashcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by iyoungman on 2020-05-02.
 */

public class Main {

    public static void main(String[] args) {

        //null
        Map<One, String> oneMap = new HashMap<>();
        oneMap.put(new One(1), "Hello");
        String oneValue = oneMap.get(new One(1));
        System.out.println(oneValue);

        //null
        Map<Two, String> twoMap = new HashMap<>();
        twoMap.put(new Two(1), "Hello");
        String twoValue = twoMap.get(new Two(1));
        System.out.println(twoValue);

        //Hello
        Map<Three, String> threeMap = new HashMap<>();
        threeMap.put(new Three(1), "Hello");
        String threeValue = threeMap.get(new Three(1));
        System.out.println(threeValue);
    }

}

class One {
    private int number;

    public One(int number) {
        this.number = number;
    }
}

class Two {
    private int number;

    public Two(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Two) {
            Two other = (Two) o;
            if(number == other.number) {
                return true;
            }
        }
       return false;
    }
}

class Three {
    private int number;

    public Three(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Three) {
            Three other = (Three) o;
            if(number == other.number) {
                return true;
            }
        }
       return false;
    }

    @Override
    public int hashCode() {
        return number;
    }
}