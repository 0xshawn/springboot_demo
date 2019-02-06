package com.wayknew.demo.login;


import com.wayknew.demo.login.response.LoginResponseDTO;


import java.util.ArrayList;
import java.util.List;

public class LoginFactory {
    static LoginDTO toLoginDTO(Login login) {
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setLoginId(login.getLoginId());
        loginDTO.setPassword(login.getPassword());
        loginDTO.setType(login.getType());
        loginDTO.setUserId(login.getUserId());
        loginDTO.setCreatedAt(login.getCreatedAt());
        loginDTO.setUpdatedAt(login.getUpdatedAt());
        return loginDTO;
    }

    static LoginResponseDTO successResponse() {
        LoginResponseDTO res = new LoginResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        return res;
    }

    static LoginResponseDTO successResponse(Login login) {
        LoginDTO loginDTO = toLoginDTO(login);
        LoginResponseDTO res = new LoginResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        res.setLogin(loginDTO);
        return res;
    }


    static LoginResponseDTO successResponse(List<Login> logins) {
        List<LoginDTO> loginDTOList = new ArrayList<>();
        logins.forEach(user -> {
            loginDTOList.add(toLoginDTO(user));
        });
        LoginResponseDTO res = new LoginResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        res.setLogins(loginDTOList);
        return res;
    }


    static LoginResponseDTO errorResponse(Integer code, String message) {
        LoginResponseDTO res = new LoginResponseDTO();
        res.setCode(code);
        res.setMessage(message);
        return res;
    }

}
