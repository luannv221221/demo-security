package com.ra.service;

import com.ra.model.dto.*;

public interface UserService {
    UserResponseDTO login(UserLoginDTO userLoginDTO);

    UserResponseRegisterDTO register(UserRegisterDTO userRegisterDTO);

    UserResponseRegisterDTO createAccount(AccountRequestDTO accountRequestDTO);
}
