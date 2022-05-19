package com.example.demologwork.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserModel {
    private long id;
    private String username;
    private String password;
    private long leaderId;
    private List<Long> roleIds;
    private List<Long> logWorkIds;
}
