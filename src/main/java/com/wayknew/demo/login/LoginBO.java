package com.wayknew.demo.login;


import com.wayknew.demo.login.request.LoginRequestDTO;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginBO {
    @Resource
    private LoginDAO loginDAO;


    Login create(long userId,Byte type,String password){
       Login login = new Login();
        login.setUserId(userId);
        login.setPassword(password);
        login.setType(type);
        return  loginDAO.save(login);
    }

    Login getByLoginId(Long loginId) {
        return loginDAO.findByLoginId(loginId);
    }

    List<Login> getLoginList() {
        return loginDAO.findAll();
    }


    void deleteLogin(Long loginId) {
        Login login = loginDAO.findByLoginId(loginId);
        if (login != null) {
            loginDAO.delete(login);
        }
    }





    Login updateLogin(Long loginId, LoginRequestDTO body) {
        Login login = loginDAO.findByLoginId(loginId);


        if (body.getPassword() != null) {
            login.setPassword(body.getPassword());
        }
        if (body.getType() != null) {
            login.setType(body.getType());
        }

        login = loginDAO.save(login);
        return login;
    }






}
