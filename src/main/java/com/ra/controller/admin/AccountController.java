package com.ra.controller.admin;

import com.ra.model.dto.AccountRequestDTO;
import com.ra.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/account")
public class AccountController {
    @Autowired
    private UserService userService;
    @PostMapping
    public ResponseEntity<?> create(@RequestBody AccountRequestDTO accountRequestDTO){
        return new ResponseEntity<>(userService.createAccount(accountRequestDTO), HttpStatus.OK);
    }
}
