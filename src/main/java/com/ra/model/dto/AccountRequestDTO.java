package com.ra.model.dto;

import lombok.*;

import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AccountRequestDTO {
    private String userName;
    private String fullName;
    private String password;
    private Boolean status;
    private Set<String> roleNames;
}
