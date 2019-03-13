package it.cast.Relect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.Format;

//自定义注解：包含JDK提供的元注解
//@Target--定义注解的使用范围，type，filed，method，attribute，parameter ，package
//@Retention 注解的存活周期，source （源码），runtime（运行时）,calss（编译后）
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnn {
    //注解也是一个类，注解中定义属性，
    //注解中的修饰符，只能是public
    public String name();
    //可以使用default赋值
    int age() default 18;
    //注解中 支持的数据类型 基本的数据类型 注解class 字节码对象，枚举，一位数组
    String[] arr();
}
