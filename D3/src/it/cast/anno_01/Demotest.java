package it.cast.anno_01;

public class Demotest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("it.cast.anno_01.QQfunction");
        System.out.println("clazz = " + clazz.getDeclaredConstructors().toString());
    }
}
