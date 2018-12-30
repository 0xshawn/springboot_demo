package com.wayknew.demo.user;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserBO {
    // BO means Bossiness Object

    @Resource
    UserDAO userDAO;

    /**
     * Create user via name, phone and gender
     * @param name
     * @param phone
     * @param gender
     * @return
     */
    User create(String name, String phone, Byte gender) {
        User user = new User();
        user.setName(name);
        user.setPhone(phone);
        user.setGender(gender);

        return userDAO.saveAndFlush(user);
    }

    /**
     * Get user by id
     * @param userId
     * @return
     */
    User getById(Long userId) {
        return userDAO.getOne(userId);
    }
}
