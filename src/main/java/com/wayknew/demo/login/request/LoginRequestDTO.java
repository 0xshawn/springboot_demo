package com.wayknew.demo.login.request;

public class LoginRequestDTO {
    private long userId;
    private Byte type;
    private String password;


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }


    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}