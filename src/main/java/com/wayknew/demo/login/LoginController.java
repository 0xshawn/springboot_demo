package com.wayknew.demo.login;


import com.wayknew.demo.login.request.LoginRequestDTO;
import com.wayknew.demo.login.response.LoginResponseDTO;
import com.wayknew.demo.sku.Sku;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v7")
public class LoginController {
    @Resource
    private LoginBO loginBO;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public LoginResponseDTO createLogin(@RequestBody LoginRequestDTO body) {
        try {
            Login login = loginBO.create(body.getUserId(),body.getType(),body.getPassword());
            return LoginFactory.successResponse(login);
        } catch (Exception e) {
            return LoginFactory.errorResponse(1, e.toString());
        }
    }





    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public LoginResponseDTO getCartList() {
        try {
            List<Login> logins = loginBO.getLoginList();
            return LoginFactory.successResponse(logins);
        } catch (Exception e) {
            return LoginFactory.errorResponse(2, e.toString());
        }
    }

    @RequestMapping(value = "/login/{loginId}", method = RequestMethod.GET)
    public LoginResponseDTO getSkuById(@PathVariable("loginId") Long loginId) {
        try {
            Login login = loginBO.getByLoginId(loginId);
            return LoginFactory.successResponse(login);
        } catch (Exception e) {
            return LoginFactory.errorResponse(3, e.toString());
        }
    }

    @RequestMapping(value = "/login/{loginId}", method = RequestMethod.PATCH)
    public LoginResponseDTO updateLogin(@PathVariable("loginId") Long loginId,
                                      @RequestBody LoginRequestDTO body) {
        try {
            Login login = loginBO.updateLogin(loginId, body);
            return LoginFactory.successResponse(login);
        } catch (Exception e) {
            return LoginFactory.errorResponse(3, e.toString());
        }
    }

    @RequestMapping(value = "/login/{skuId}", method = RequestMethod.DELETE)
    public LoginResponseDTO deleteSku(@PathVariable("skuId") Long loginId) {
        try {
            loginBO.deleteLogin(loginId);
            return LoginFactory.successResponse();
        } catch (Exception e) {
            return LoginFactory.errorResponse(3, e.toString());
        }
    }


}
