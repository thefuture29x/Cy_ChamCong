package com.example.demologwork.dto;

import com.example.demologwork.entity.RoleEntity;
import com.example.demologwork.entity.UserEntity;
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
    private List<RoleDto> roleList;
    private List<LogWorkDto> logWorkList;

    public static UserDto toDto(UserEntity entity) {
        return UserDto.builder()
                .id(entity.getId())
                .username(entity.getUsername())
                .leaderId(entity.getId_leader() != null ? entity.getId_leader() : 0L)
                .roleList(entity.getRoleEntityList() != null ? entity.getRoleEntityList().stream().map(RoleDto::toDto).collect(Collectors.toList()) : null)
                .logWorkList(entity.getLogWorkEntities() != null ? entity.getLogWorkEntities().stream().map(LogWorkDto::toDto).collect(java.util.stream.Collectors.toList()) : null)
                .build();
    }


}
