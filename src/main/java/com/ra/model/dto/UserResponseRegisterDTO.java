package com.ra.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserResponseRegisterDTO {
    private String userName;
    private String fullName;
}
