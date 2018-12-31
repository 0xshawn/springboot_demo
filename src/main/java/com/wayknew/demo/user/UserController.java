package com.wayknew.demo.user;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/api/v1")
public class UserController {

    @Resource
    private UserBO userBO;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public UserResponseDTO createUser(@RequestBody UserRequestDTO body) {
        try {
            User user = userBO.create(body.getName(), body.getPhone(), (byte) body.getGender());
            return UserFactory.successResponse(user);
        } catch (Exception e) {
            return UserFactory.errorResponse(1, e.toString());
        }
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public UserResponseDTO getUserById(@PathVariable("userId") Long userId) {
        try {
            User user = userBO.getById(userId);
            return UserFactory.successResponse(user);
        } catch (Exception e) {
            return UserFactory.errorResponse(2, e.toString());
        }
    }


 /*   @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public UserResponseDTO delete(@PathVariable("userId") Long userId) {
        try {
            User user = userBO.delete(Long userId);
            return UserFactory.successResponse(user);
        } catch (Exception e) {
            return UserFactory.errorResponse(2, e.toString());
        }
    }*/

/*
   @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public UserResponseDTO update(@RequestBody UserRequestDTO body) {
        try {
            User user = userBO.update(body.getName(), body.getPhone(), (byte) body.getGender());
            return UserFactory.successResponse(user);
        } catch (Exception e) {
            return UserFactory.errorResponse(2, e.toString());
        }
    }*/

    @RequestMapping(value = "/deletewhere/{userId}" ,method = RequestMethod.GET)
    public UserResponseDTO deleteuser(@PathVariable("userID") Long userId) {
        try {
            User user = userBO.deleteuser(userId);
            return UserFactory.successResponse(user);
        } catch (Exception e) {
            return UserFactory.errorResponse(2, e.toString());
        }
    }
 /*   public String delete(){
        User user = new UserBO().delete();
        user.setId(2L);
        UserDAO.delete(user);
        return "执行了删除操作";

    }*/




}

