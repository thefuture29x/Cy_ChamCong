package com.example.demologwork.service;

import com.example.demologwork.entity.UserEntity;

public interface IUserService<T,M,K> extends IBaseService<T,M,K>{
    UserEntity findByToken(String token);
    void updateUserToken(String email, String token);
    void sendMailResetPassword(String from,String toAddress,String subject,String content,String tokenString);
}
