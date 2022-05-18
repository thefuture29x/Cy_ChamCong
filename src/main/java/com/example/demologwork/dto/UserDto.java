package com.example.demologwork.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserDto {
    private long id;
    private String username;
    private String password;
    private long leaderId;
    private List<RoleDto> roleList;
    private List<LogWorkDto> logWorkList;
}
