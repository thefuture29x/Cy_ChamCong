package com.example.demologwork.repository;

import com.example.demologwork.entity.LogWorkEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILogWorkRepository extends JpaRepository<LogWorkEntity, Long> {
}
