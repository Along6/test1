package it.cast.Relect;

import it.cast.Relect.MyAnn;
import it.cast.Relect.MyAnn_02;

public class MyAnnoDemo {
    //注解使用的时候，如果属性没有初始化，必须给一个。
    @MyAnn(name = "张三",age = 18,arr = {"你好","注解"})
    //定义的时候在属性和方法之上
    private String address;

    public static void main(String[] args) {

    }
    //定义的时候，只能在方法之上
    @MyAnn_02("你好")
    public static void show(){

    }

}
