package com.example.demologwork.repository;

import com.example.demologwork.entity.RequestEntity;
import com.example.demologwork.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRequestRepository extends JpaRepository<RequestEntity, Long> {
}
