package com.example.demologwork.repository;

import com.example.demologwork.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
