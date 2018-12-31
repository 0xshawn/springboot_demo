package com.wayknew.demo.user.response;

import com.wayknew.demo.user.UserDTO;

import java.util.List;

public class UserListResonseDTO {
    private Integer code;
    private String message;
    private List<UserDTO> users;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<UserDTO> getUsers() {
        return users;
    }

    public void setUsers(List<UserDTO> users) {
        this.users = users;
    }
}
