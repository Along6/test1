package it.cast.anno;
import java.util.*;

public class LoginDemo_01 {
    public static void main(String[] args) {
        //1.添加用户数据，建一个集合存储模拟数据
        ArrayList<User> arrayList = new ArrayList<>();
        //存放模拟数据
        arrayList.add(new User("张三","123456"));
        arrayList.add(new User("李四","123456"));
        arrayList.add(new User("王五","111111"));
        arrayList.add(new User("赵六","222222"));
        //用户输入账号和密码
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的用户名");
        String username = scanner.nextLine();
        System.out.println("请输入你的密码");
        String pwd = scanner.nextLine();
        //判断用户输入的信息与现有集合中的数据是否匹配
        boolean flag = false;//利用标签更容易后期的扩展
        for (User user : arrayList) {
            if(user.getUername().equals(username)&&user.getPassword().equals(pwd)){

                flag = true;
            }
        }
        QQfunciton qqfunciton = new QQfunciton();
        if(flag){
            System.out.println("登陆成功");
            System.out.println("请选择一下功能：publicLog:发表日志 lookTalk:查看说说 lookPhoto:查看照片 message：空间留言");
           //获取用户的选择
            String choose = scanner.nextLine();
            //根据用户的选择，实现不同的功能
            switch (choose){
                case"publicLog":
                    qqfunciton.publicLog();
                    break;
                case"lookTalk":
                    qqfunciton.lookTalk();
                    break;
                case"lookPhoto":
                    qqfunciton.lookPhoto();
                    break;
                case"message":
                    qqfunciton.message();
                    break;
            }
        }
        else {
            System.out.println("登陆失败喽，该充值了");
        }
    }
}
