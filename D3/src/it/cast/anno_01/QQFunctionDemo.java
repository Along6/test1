package it.cast.anno_01;

import it.cast.anno_01.QQfunction;
import it.cast.anno_01.User;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class QQFunctionDemo {
    public static void main(String[] args) throws Exception {
        //1.添加用户数据，建一个集合存储模拟数据
        ArrayList<User> arrayList = new ArrayList<>();
        //存放模拟数据
        ArrayList<String> zhanglist = new ArrayList<>();
        zhanglist.add("publicLog");
        arrayList.add(new User("张三","123456",zhanglist));
        ArrayList<String> lilist = new ArrayList<>();
        lilist.add("lookTalk");
        lilist.add("lookPhoto");
        arrayList.add(new User("李四","123456",lilist));
        ArrayList<String> wanglist = new ArrayList<>();
        wanglist.add("lookTalk");
        wanglist.add("lookPhoto");
        wanglist.add("message");
        arrayList.add(new User("王五","111111",wanglist));
        ArrayList<String> zhaolist = new ArrayList<>();
        arrayList.add(new User("赵六","222222",zhaolist));
        //用户输入账号和密码
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的用户名");
        String username = scanner.nextLine();
        System.out.println("请输入你的密码");
        String pwd = scanner.nextLine();
        //判断用户输入的信息与现有集合中的数据是否匹配
        boolean flag = false;//利用标签更容易后期的扩展
        User u = null;
        for (User user : arrayList) {
            if(user.getUsername().equals(username)&&user.getPassword().equals(pwd)){
                flag = true;
                u = user;
            }
        }
        QQfunction qqfunciton = new QQfunction();
        if(flag){
            System.out.println("登陆成功");
            System.out.println("请选择一下功能：publicLog:发表日志 lookTalk:查看说说 lookPhoto:查看照片 message：空间留言");
            //获取用户的选择
            String choose = scanner.nextLine();
            //根据用户的选择，实现不同的功能
            login(choose,u);
        }
        else {
            System.out.println("登陆失败喽，该充值了");
        }
    }

    //利用登陆功能判断，不同用户的功能权限（利用反射技术，获取对象的方法，看方法上的权限是否与用户的权限匹配）

    public static void login(String choose,User user) throws Exception {
        //获取功能类的字节码对象
        Class<?> clazz = Class.forName("it.cast.anno_01.QQfunction");
        //需要创建一个功能实现对象，方便后面的该实现对象上方法的获取
        QQfunction qqfunction =(QQfunction) clazz.newInstance();
        //获取用户选择的方法
        Method method = clazz.getMethod(choose);
        //判断该方法上是否有注解
        if(method.isAnnotationPresent(MyAnn.class)) {
            //获取注解对象
            MyAnn annotation = method.getAnnotation(MyAnn.class);
            //使用注解对获取的方法的权限信息
            String value = annotation.value();
            //获取用户具备的权限
            ArrayList<String> list = user.getList();
            //判断用户的权限集合中是存在对应的标注信息
            if(list.contains(value)){
                method.invoke(qqfunction);
            }
            else {
                System.out.println("你已经被拉黑……");
            }
        }



    }
}
