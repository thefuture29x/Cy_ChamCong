package com.example.demologwork.repository;

import com.example.demologwork.entity.RoleEntity;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<RoleEntity, Long> {

=======
import com.example.demologwork.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<RoleEntity, Long> {
    RoleEntity findByRole(String role);
>>>>>>> 5bb6b2b2fcb0c03ddac77b22fa601cae001b6d81
}
