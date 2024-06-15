package com.ra.service;

import com.ra.model.dto.UserLoginDTO;
import com.ra.model.dto.UserResponseDTO;
import com.ra.security.UserPrinciple;
import com.ra.security.jwt.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private AuthenticationProvider authenticationProvider;
    @Autowired
    private JwtProvider jwtProvider;
    @Override
    public UserResponseDTO login(UserLoginDTO userLoginDTO) {
        Authentication authentication;
        authentication = authenticationProvider.
                authenticate(new UsernamePasswordAuthenticationToken(userLoginDTO.getUserName(),userLoginDTO.getPassword()));
        UserPrinciple userPrinciple = (UserPrinciple) authentication.getPrincipal();
        return UserResponseDTO.builder().
                userName(userPrinciple.getUsername()).
                fullName(userPrinciple.getUser().getFullName()).
                roles(userPrinciple.getUser().getRoles()).
                typeToken("Bearer").
                token(jwtProvider.generateToken(userPrinciple)).build();

    }
}
