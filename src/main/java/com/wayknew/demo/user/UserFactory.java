package com.wayknew.demo.user;

public class UserFactory {

    public static UserDTO toUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setGender(user.getGender());
        userDTO.setPhone(user.getPhone());
        userDTO.setCreatedAt(user.getCreatedAt());
        userDTO.setUpdatedAt(user.getUpdatedAt());
        return userDTO;
    }

    public static UserResponseDTO successResponse(User user) {
        UserDTO userDTO = toUserDTO(user);
        UserResponseDTO res = new UserResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        res.setUser(userDTO);
        return res;
    }

    public static UserResponseDTO errorResponse(Integer code, String message) {
        UserResponseDTO res = new UserResponseDTO();
        res.setCode(code);
        res.setMessage(message);
        return res;
    }
}
