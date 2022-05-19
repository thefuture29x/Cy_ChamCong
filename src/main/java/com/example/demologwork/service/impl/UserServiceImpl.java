package com.example.demologwork.service.impl;

import com.example.demologwork.dto.UserDto;
import com.example.demologwork.entity.UserEntity;
import com.example.demologwork.model.UserModel;
import com.example.demologwork.service.IUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService<UserEntity, UserModel, Long>, UserDetailsService {
    @Override
    public UserEntity findByToken(String token) {
        return null;
    }

    @Override
    public List<UserEntity> findAll() {
        return null;
    }

    @Override
    public Page<UserEntity> findAll(Pageable page) {
        return null;
    }

    @Override
    public UserEntity findById(Long id) {
        return null;
    }

    @Override
    public UserEntity add(UserDto dto) {
        return null;
    }

    @Override
    public List<UserEntity> add(List<UserDto> dtoList) {
        return null;
    }

    @Override
    public UserEntity update(UserDto dto) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

//    public UserEntity modelToEntity(UserModel model){
//        UserEntity entity = new UserEntity();
//        entity.setId(model.getId());
//        entity.setUsername(model.getUsername());
//        entity.setPassword(model.getPassword());
//        entity.setId_leader(model.getLeaderId());
//        entity.setRoleEntityList(model.getRoleList().stream().map(
//                (roleModel) ->
//        ));
//    }
}
