package com.ra.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserRegisterDTO {
    private String userName;
    private String fullName;
    private String password;
}
