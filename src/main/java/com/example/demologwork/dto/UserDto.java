package com.example.demologwork.dto;

import com.example.demologwork.entity.UserEntity;
import com.example.demologwork.model.UserModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserDto {
    private long id;
    private String username;
    private String password;
    private long leaderId;
    private List<Long> roleIds;
    private List<Long> logWorkIds;

    public static UserModel dtoToModel(UserDto dto){
        UserModel model = new UserModel();
        model.setId(dto.getId());
        model.setUsername(dto.getUsername());
        model.setPassword(dto.getPassword());
        model.setLeaderId(dto.getLeaderId());
        model.setRoleIds(dto.getRoleIds());

        return model;
    }

//    public static UserEntity dtoToEntity(UserDto dto){
//        UserEntity entity = new UserEntity();
//        entity.setId(dto.getId());
//        entity.setUsername(dto.getUsername());
//        entity.setPassword(dto.getPassword());
//        entity.setId_leader(dto.getLeaderId());
//        entity.setRoleEntityList(dto.getRoleList().stream().map((roleDto)
//        -> RoleDto.dtoToModel()));
//    }
}
