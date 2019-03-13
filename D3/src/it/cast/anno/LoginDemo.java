package it.cast.anno;
import java.util.*;
//通过案例模拟注释的使用。用户登陆校验
public class LoginDemo {
    public static void main(String[] args) {
        //1.准备一些数据，模拟已存在的账户
        ArrayList<User> arrayList = new ArrayList<>();
       arrayList.add(new User("张三", "123456")) ;
        arrayList.add(new User("李四", "123")) ;
        arrayList.add(new User("王五", "111111")) ;
        arrayList.add(new User("赵六", "000000")) ;
        //2.使用键盘输入，让用户输入用户和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的用户名：");
        String username = sc.nextLine();
        System.out.println("请输入你的用户名：");
        String password = sc.nextLine();
        //3.讲用户输入的数据与集合中的数据进行匹配，如果存在就登陆成功，否则就失败。
        boolean flag = false;
        for (User user : arrayList) {
            if (user.getUername().equals(username) && user.getPassword().equals(password)) {
                //证明登陆成功
                flag = true;
            }
        }
        if (flag){
            System.out.println("登陆成功");
        }
            else {
                System.out.println("您输入的账号或密码错误");
            }

    }
}
