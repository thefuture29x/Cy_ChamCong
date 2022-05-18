package com.example.demologwork.model;

import com.example.demologwork.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Role {
    private long id;
    private String name;
    private List<User> userList;
}
