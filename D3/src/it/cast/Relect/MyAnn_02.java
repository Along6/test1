package it.cast.Relect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnn_02 {
    String value();
    //注解中只有一个属性，并且属性名叫value使用注解时 属性名可以省略。
}
