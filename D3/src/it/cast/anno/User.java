package it.cast.anno;

public class User {
    private  String uername;
    private  String password;

    public User() {
    }

    public User(String uername, String password) {
        this.uername = uername;
        this.password = password;
    }

    public String getUername() {
        return uername;
    }

    public void setUername(String uername) {
        this.uername = uername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
