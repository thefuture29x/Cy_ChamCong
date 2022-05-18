package com.example.demologwork.repository;

import com.example.demologwork.entity.RoleEntity;
import com.example.demologwork.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<RoleEntity, Long> {
    RoleEntity findByRole(String role);
}
