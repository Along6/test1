package it.cast.anno_01;
//定义一个自定义注解，为了给方法添加，范围在方法上，生命周期为运行时
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnn {
public String value();
}
