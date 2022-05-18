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
public class User {
    private long id;
    private String username;
    private String password;
    private long leaderId;
    private List<Role> roleList;
    private List<LogWork> logWorkList;
}
