package it.cast.anno_01;

public class QQfunction {
    //给方法上添加自定义注解，以方便核对用户的权限
    @MyAnn("publicLog")
    public void publicLog(){

        System.out.println("发表了一篇日志！");
    }
    @MyAnn("lookTalk")
    public void lookTalk(){
        System.out.println("查看日志！");
    }
    @MyAnn("lookPhoto")
    public void lookPhoto(){
        System.out.println("查看照片！");
    }
    @MyAnn("message")
    public void message(){
        System.out.println("空间留言成功！");
    }
}
