package com.example.demologwork.repository;

import com.example.demologwork.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

public interface IUserRepository extends JpaRepository<UserEntity, Long> {

=======
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
>>>>>>> 5bb6b2b2fcb0c03ddac77b22fa601cae001b6d81
}
