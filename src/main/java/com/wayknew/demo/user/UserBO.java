package com.wayknew.demo.user;

import com.wayknew.demo.user.request.UserRequestDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserBO {
    // BO means Bossiness Object

    @Resource
    private UserDAO userDAO;

    /**
     * Create user via name, phone and gender
     *
     * @param name
     * @param phone
     * @param gender
     * @return
     */
    User create(String name, String phone, Byte gender,String password) {
        User user = new User();
        user.setName(name);
        user.setPhone(phone);
        user.setGender(gender);
        user.setPassword(password);

        return userDAO.save(user);
    }

    /**
     * Get user by id
     *
     * @param userId
     * @return
     */
    User getById(Long userId) {
        return userDAO.findUserByUserId(userId);
    }

    List<User> getUserList() {
        return userDAO.findAll();
    }

    User updateUser(Long userId, UserRequestDTO body) {
        User user = userDAO.findUserByUserId(userId);

        if (body.getPhone() != null) {
            user.setPhone(body.getPhone());
        }
        if (body.getName() != null) {
            user.setName(body.getName());
        }
        if (body.getGender() != null) {
            user.setGender(body.getGender());
        }
        if (body.getPassword() != null) {
            user.setPassword(body.getPassword());
        }


        user = userDAO.save(user);
        return user;
    }

    void deleteUser(Long userId) {
        User user = userDAO.findUserByUserId(userId);
        if (user != null) {
            userDAO.delete(user);
        }
    }
}
