package com.wayknew.demo.login.response;

import com.wayknew.demo.login.LoginDTO;

import java.util.List;

public class LoginResponseDTO {
    private Integer code;
    private String message;
    private LoginDTO login;
    private List<LoginDTO> logins;

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

    public LoginDTO getLogin() {
        return login;
    }

    public void setLogin(LoginDTO login) {
        this.login = login;
    }

    public List<LoginDTO> getLogins() {
        return logins;
    }

    public void setLogins(List<LoginDTO> logins) {
        this.logins = logins;
    }
}
