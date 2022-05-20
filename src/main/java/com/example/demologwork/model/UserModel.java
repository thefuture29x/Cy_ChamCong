package com.example.demologwork.model;

import com.example.demologwork.dto.UserDto;
import com.example.demologwork.entity.UserEntity;
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

    public static UserEntity modelToEntity(UserModel model){
        UserEntity entity = new UserEntity();
        entity.setId(model.getId());
        entity.setUsername(model.getUsername());
        entity.setPassword(model.getPassword());
        entity.setId_leader(model.getLeaderId());
        return entity;
    }
}
