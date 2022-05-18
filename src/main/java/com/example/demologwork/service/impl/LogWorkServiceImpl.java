package com.example.demologwork.service.impl;

import com.example.demologwork.entity.LogWorkEntity;
import com.example.demologwork.entity.UserEntity;
import com.example.demologwork.model.LogWorkModel;
import com.example.demologwork.model.UserModel;
import com.example.demologwork.repository.ILogWorkRepository;
import com.example.demologwork.service.ILogWorkService;
import com.example.demologwork.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogWorkServiceImpl implements ILogWorkService<LogWorkEntity, LogWorkModel, Long>{
    @Autowired
    ILogWorkRepository iLogWorkRepository;
    @Override
    public List<LogWorkEntity> findAll() {
        return null;
    }

    @Override
    public Page<LogWorkEntity> findAll(Pageable page) {
        return null;
    }

    @Override
    public LogWorkEntity findById(Long id) {
        return null;
    }

    @Override
    public LogWorkEntity add(LogWorkModel model) {
        LogWorkEntity logWorkEntity = LogWorkModel.toEntity(model);
        return iLogWorkRepository.save(logWorkEntity);
    }

    @Override
    public List<LogWorkEntity> add(List<LogWorkModel> model) {
        return null;
    }

    @Override
    public LogWorkEntity update(LogWorkModel model) {
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
}
