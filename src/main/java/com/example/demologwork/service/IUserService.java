package com.example.demologwork.service;

import com.example.demologwork.dto.UserDto;
import com.example.demologwork.entity.UserEntity;
import com.example.demologwork.service.base.IBaseService;

public interface IUserService<E, D, L> extends IBaseService<UserEntity, UserDto, Long> {
    UserEntity findByToken(String token);
}
