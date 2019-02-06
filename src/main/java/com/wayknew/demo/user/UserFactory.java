package com.wayknew.demo.user;

import com.wayknew.demo.user.response.UserResponseDTO;

import java.util.ArrayList;
import java.util.List;

public class UserFactory {

    static UserDTO toUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setName(user.getName());
        userDTO.setGender(user.getGender());
        userDTO.setPhone(user.getPhone());
        userDTO.setPassword(user.getPassword());
        userDTO.setCreatedAt(user.getCreatedAt());
        userDTO.setUpdatedAt(user.getUpdatedAt());
        return userDTO;
    }

    static UserResponseDTO successResponse() {
        UserResponseDTO res = new UserResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        return res;
    }

    static UserResponseDTO successResponse(User user) {
        UserDTO userDTO = toUserDTO(user);
        UserResponseDTO res = new UserResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        res.setUser(userDTO);
        return res;
    }

    static UserResponseDTO successResponse(List<User> users) {
        List<UserDTO> userDTOList = new ArrayList<>();
        users.forEach(user -> {
            userDTOList.add(toUserDTO(user));
        });
        UserResponseDTO res = new UserResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        res.setUsers(userDTOList);
        return res;
    }

    static UserResponseDTO errorResponse(Integer code, String message) {
        UserResponseDTO res = new UserResponseDTO();
        res.setCode(code);
        res.setMessage(message);
        return res;
    }
}
