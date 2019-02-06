package com.wayknew.demo.login;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Login {
    private long loginId;
    private long userId;
    private Byte type;
    private String password;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "login_id")
    public long getLoginId() {
        return loginId;
    }

    public void setLoginId(long loginId) {
        this.loginId = loginId;
    }

    @Basic
    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "type")
    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Login login = (Login) o;
        return loginId == login.loginId &&
                userId == login.userId &&
                Objects.equals(type, login.type) &&
                Objects.equals(password, login.password) &&
                Objects.equals(createdAt, login.createdAt) &&
                Objects.equals(updatedAt, login.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginId, userId, type, password, createdAt, updatedAt);
    }
}
