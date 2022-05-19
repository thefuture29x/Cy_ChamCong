package com.example.demologwork.service.impl;

import com.example.demologwork.dto.RoleDto;
import com.example.demologwork.entity.RoleEntity;
import com.example.demologwork.model.RoleModel;
import com.example.demologwork.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    UserServiceImpl userService;

    @Override
    public List<RoleEntity> findAll() {
        return null;
    }

    @Override
    public Page<RoleEntity> findAll(Pageable page) {
        return null;
    }

    @Override
    public RoleEntity findById(Long id) {
        return null;
    }

    @Override
    public RoleEntity add(RoleDto dto) {
        return null;
    }

    @Override
    public List<RoleEntity> add(List<RoleDto> dtoList) {
        return null;
    }

    @Override
    public RoleEntity update(RoleDto dto) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

//    public RoleEntity modelToEntity(RoleModel model){
//        RoleEntity entity = new RoleEntity();
//        entity.setId(model.getId());
//        entity.setRole(model.getName());
//        entity.setUserEntityList(model.getUserModelList().stream().map(
//                (userModel) -> userService.
//        ));
//    }
}
