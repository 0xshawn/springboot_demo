package com.wayknew.demo.login;

import com.alibaba.fastjson.annotation.JSONField;

import java.sql.Timestamp;

public class LoginDTO {
    private long loginId;
    private long userId;
    private Byte type;
    private String password;
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Timestamp createdAt;
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Timestamp updatedAt;

    public long getLoginId() {
        return loginId;
    }

    public void setLoginId(long loginId) {
        this.loginId = loginId;
    }

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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}