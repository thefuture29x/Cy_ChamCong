package com.example.demologwork.dto;

import com.example.demologwork.entity.RoleEntity;
import com.example.demologwork.model.RoleModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class RoleDto {
    private long id;
    private String name;
    private List<Long> userIds;

    public static RoleModel dtoToModel(RoleDto dto) {
        RoleModel model = new RoleModel();
        model.setId(dto.getId());
        model.setName(dto.getName());
        model.setUserIds(dto.getUserIds());
        return model;
    }
}
