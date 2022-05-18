package com.example.demologwork.service.impl;

import com.example.demologwork.dto.UserDto;
import com.example.demologwork.entity.UserEntity;
import com.example.demologwork.model.UserModel;
import com.example.demologwork.repository.IUserRepository;
import com.example.demologwork.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService<UserDto, UserModel, Long>, UserDetailsService {
    @Autowired
    IUserRepository iUserRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = iUserRepository.findByUsername(username);
        if (userEntity == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new UserDetailsImpl(userEntity);
    }

    @Override
    public List<UserDto> findAll() {
        return null;
    }

    @Override
    public Page<UserDto> findAll(Pageable page) {
        return null;
    }

    @Override
    public UserDto findById(Long id) {
        return null;
    }

    @Override
    public UserDto add(UserModel model) {
        return null;
    }

    @Override
    public List<UserDto> add(List<UserModel> model) {
        return null;
    }

    @Override
    public UserDto update(UserModel model) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public boolean deleteByIds(List<Long> id) {
        return false;
    }

    @Override
    public UserEntity findByToken(String token) {
        return null;
    }

    @Override
    public void updateUserToken(String email, String token) {

    }

    @Override
    public void sendMailResetPassword(String from, String toAddress, String subject, String content, String tokenString) {

    }
}
