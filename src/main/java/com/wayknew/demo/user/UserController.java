package com.wayknew.demo.user;

import com.wayknew.demo.user.request.UserRequestDTO;
import com.wayknew.demo.user.response.UserResponseDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class UserController {

    @Resource
    private UserBO userBO;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public UserResponseDTO createUser(@RequestBody UserRequestDTO body) {
        try {
            User user = userBO.create(body.getName(), body.getPhone(), (byte) body.getGender(),body.getPassword());
            return UserFactory.successResponse(user);
        } catch (Exception e) {
            return UserFactory.errorResponse(1, e.toString());
        }
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public UserResponseDTO getUserList() {
        try {
            List<User> users = userBO.getUserList();
            return UserFactory.successResponse(users);
        } catch (Exception e) {
            return UserFactory.errorResponse(2, e.toString());
        }
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public UserResponseDTO getUserById(@PathVariable("userId") Long userId) {
        try {
            User user = userBO.getById(userId);
            return UserFactory.successResponse(user);
        } catch (Exception e) {
            return UserFactory.errorResponse(3, e.toString());
        }
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.PATCH)
    public UserResponseDTO updateUser(@PathVariable("userId") Long userId,
                                      @RequestBody UserRequestDTO body) {
        try {
            User user = userBO.updateUser(userId, body);
            return UserFactory.successResponse(user);
        } catch (Exception e) {
            return UserFactory.errorResponse(3, e.toString());
        }
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.DELETE)
    public UserResponseDTO deleteUser(@PathVariable("userId") Long userId) {
        try {
            userBO.deleteUser(userId);
            return UserFactory.successResponse();
        } catch (Exception e) {
            return UserFactory.errorResponse(3, e.toString());
        }
    }
}
