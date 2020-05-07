package reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by iyoungman on 2020-05-06.
 */

@Retention(RetentionPolicy.RUNTIME)//어노테이션 정보를 Runtime까지 유지하기 위함
public @interface Iyoungman {

    String name() default "youngjun";

    int age() default 27;
}
