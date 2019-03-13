package it.cast.anno_01;
import java.util.*;
public class User {
    private String username;
    private String password;
    //方法权限集合
    private ArrayList<String> list = new ArrayList<>();

    public User(){}

    public User(String username, String password, ArrayList<String> list) {
        this.username = username;
        this.password = password;
        this.list = list;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }
}
