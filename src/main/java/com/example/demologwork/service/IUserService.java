package com.example.demologwork.service;

import com.example.demologwork.dto.UserDto;
import com.example.demologwork.entity.UserEntity;
import com.example.demologwork.service.base.IBaseService;

public interface IUserService<T, M, K> extends IBaseService<T, M, K> {
    UserEntity findByToken(String token);
}
