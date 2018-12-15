package com.wayknew.demo.user;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/api/v1")
public class UserController {

    @Resource
    private UserBO userBO;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String createUser() {
        try {
            User user = userBO.create(
                    "Shawn",
                    "186000000",
                    (byte) 1);
            return user.toString();
        } catch (Exception e) {
            return "Error when create";
        }
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public String getUserById(@PathVariable("userId") Long userId) {
        try {
            User user = userBO.getById(userId);
            return user.toString();
        } catch (Exception e) {
            return "Error when get";
        }
    }
}
