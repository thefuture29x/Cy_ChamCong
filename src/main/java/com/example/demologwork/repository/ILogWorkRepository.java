package com.example.demologwork.repository;

import com.example.demologwork.entity.LogWorkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ILogWorkRepository extends JpaRepository<LogWorkEntity, Long> {
    @Query(value = "SELECT l FROM LogWorkEntity l WHERE l.userEntity.id=?1")
    List<LogWorkEntity> getLogWorkEntityByUserId(long id);
}
