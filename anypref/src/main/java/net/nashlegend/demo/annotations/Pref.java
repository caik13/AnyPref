package net.nashlegend.demo.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.CLASS;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by NashLegend on 16/5/20.
 */
@Target(FIELD)
@Retention(RUNTIME)
public @interface Pref {
    String value() default "";

    // TODO: 16/5/22 默认参数，先不加 
//    String[] def() default "";
}
