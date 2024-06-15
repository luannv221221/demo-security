package com.ra.service;

import com.ra.model.dto.UserLoginDTO;
import com.ra.model.dto.UserRegisterDTO;
import com.ra.model.dto.UserResponseDTO;
import com.ra.model.dto.UserResponseRegisterDTO;

public interface UserService {
    UserResponseDTO login(UserLoginDTO userLoginDTO);

    UserResponseRegisterDTO register(UserRegisterDTO userRegisterDTO);
}
