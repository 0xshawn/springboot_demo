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
    public User createUser() {
//        try {
        return userBO.create(
                "Shawn",
                "186000000",
                (byte) 1);
//        } catch (Exception e) {
//            System.out.println(e.toString());
//            return null;
//        }
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public UserDTO getUserById(@PathVariable("userId") Long userId) {
        try {
            User user = userBO.getById(userId);
            UserDTO userDTO = new UserDTO();
            userDTO.setId(user.getId());
            userDTO.setName(user.getName());
            userDTO.setGender(user.getGender());
            userDTO.setPhone(user.getPhone());
            userDTO.setCreatedAt(user.getCreatedAt());
            userDTO.setUpdatedAt(user.getUpdatedAt());

            return userDTO;
        } catch (Exception e) {
            return null;
        }
    }
}
