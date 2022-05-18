package com.example.demologwork.dto;

import com.example.demologwork.entity.RoleEntity;
import com.example.demologwork.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class RoleDto {
    private Long id;
    private String role;

    public static RoleDto toDto(RoleEntity entity) {
        return RoleDto.builder()
                .id(entity.getId())
                .role(entity.getRole())
                .build();
    }
}
