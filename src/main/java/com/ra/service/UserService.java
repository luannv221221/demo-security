package com.ra.service;

import com.ra.model.dto.UserLoginDTO;
import com.ra.model.dto.UserResponseDTO;

public interface UserService {
    UserResponseDTO login(UserLoginDTO userLoginDTO);
}
