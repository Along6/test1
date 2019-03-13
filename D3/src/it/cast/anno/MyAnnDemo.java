package it.cast.anno;

import java.lang.reflect.Field;

//解析注解获取注解对象 操作对象中的数据
//步骤：
//1.获取注解所在类的字节码对象
//2.使用字节码对象获取注使用位置的对象(方法,成员变量 对象)
//3.判断当前方法或者成员变量上是否存在注解
//4.如果存在则获取注解对象
//5.使用注解对象获取注解的属性值
public class MyAnnDemo {
    @MyAnn(name = "张三",age = 20,arr = {"你好","java"})
    private String address;

    public static void main(String[] args) throws Exception {
        //获取注释的属性值
        //注释的解析进行操作
        //1.获取注解缩在类的字节码对象
        Class<?> clazz = Class.forName("it.cast.anno.MyAnnDemo");
        //2.使用字节码对象获取注使用位置的对象(方法,成员变量 对象)
        Field address = clazz.getDeclaredField("address");
        //3.判断当前方法或者成员变量上是否存在注解
        boolean flag = address.isAnnotationPresent(MyAnn.class);
        //4.如果存在则获取注释对象 getAnnotation
        if(flag){
            MyAnn annotation = address.getAnnotation(MyAnn.class);
            System.out.println(annotation.name());
            System.out.println(annotation.age());
            String[] arr = annotation.arr();
            for (String s : arr) {
                System.out.println(s);
            }
        }
    }
}
