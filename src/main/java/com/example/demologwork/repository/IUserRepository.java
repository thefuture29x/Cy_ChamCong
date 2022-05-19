package com.example.demologwork.repository;

import com.example.demologwork.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
