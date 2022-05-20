package com.example.demologwork.service.impl;

import com.example.demologwork.entity.LogWorkEntity;
import com.example.demologwork.entity.UserEntity;
import com.example.demologwork.model.LogWorkModel;
import com.example.demologwork.model.UserModel;
import com.example.demologwork.repository.ILogWorkRepository;
import com.example.demologwork.dto.LogWorkDto;
import com.example.demologwork.entity.LogWorkEntity;
import com.example.demologwork.model.LogWorkModel;
import com.example.demologwork.repository.ILogWorkRepository;
import com.example.demologwork.repository.IRequestRepository;
import com.example.demologwork.repository.IUserRepository;
import com.example.demologwork.service.ILogWorkService;
import com.example.demologwork.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LogWorkServiceImpl implements ILogWorkService<LogWorkEntity, LogWorkModel, Long>{
    @Autowired
    ILogWorkRepository iLogWorkRepository;
    @Autowired
    IUserRepository iUserRepository;
    @Autowired
    IRequestRepository iRequestRepository;

    @Override
    public List<LogWorkEntity> findAll() {
        return iLogWorkRepository.findAll();
    }

    @Override
    public Page<LogWorkEntity> findAll(Pageable page) {
        return iLogWorkRepository.findAll(page);
    }

    @Override
    public LogWorkEntity findById(Long id) {
        return iLogWorkRepository.findById(id).get();
    }

    @Override
    public LogWorkEntity add(LogWorkModel model) {
        LogWorkEntity logWorkEntity = LogWorkModel.toEntity(model);
        logWorkEntity.setUserEntity(iUserRepository.findById(model.getUserId()).get());
        return iLogWorkRepository.save(logWorkEntity);
    }

    @Override
    public List<LogWorkEntity> add(List<LogWorkModel> model) {
        return null;
    }

    @Override
    public LogWorkEntity update(LogWorkModel model) {
        //        if(logWorkRepository.findById(dto.getId()).isPresent()){
//            LogWorkModel model = LogWorkDto.dtoToModel(dto);
//            LogWorkEntity entity = this.modelToEntity(model);
//            return logWorkRepository.save(entity);
//        }else {
//            return null;
//        }
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

//    @Override
//    public List<LogWorkEntity> findAll() {
//        return null;
//    }

//
//@Service
//public class LogWorkServiceImpl implements ILogWorkService {
//    @Autowired
//    ILogWorkRepository logWorkRepository;
//
//    @Autowired
//    IUserRepository userRepository;
//
//    @Autowired
//    IRequestRepository requestRepository;
//
//    @Override
//    public List<LogWorkEntity> findAll() {
//        return logWorkRepository.findAll();
//>>>>>>> 1cf75d5bb53235ee7c96d3d78f7bff406952f058
//    }
//
//    @Override
//    public Page<LogWorkEntity> findAll(Pageable page) {
//<<<<<<< HEAD
//        return null;
//=======
//        return logWorkRepository.findAll(page);
//>>>>>>> 1cf75d5bb53235ee7c96d3d78f7bff406952f058
//    }
//
//    @Override
//    public LogWorkEntity findById(Long id) {
//<<<<<<< HEAD
//        return null;
//    }
//
//    @Override
//    public LogWorkEntity add(LogWorkModel model) {
//        LogWorkEntity logWorkEntity = LogWorkModel.toEntity(model);
//        return iLogWorkRepository.save(logWorkEntity);
//    }
//
//    @Override
//    public List<LogWorkEntity> add(List<LogWorkModel> model) {
//=======
//        return logWorkRepository.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
//    }
//
//    @Override
//    public LogWorkEntity add(LogWorkDto dto) {
//        LogWorkModel model = LogWorkDto.dtoToModel(dto);
//        LogWorkEntity entity = this.modelToEntity(model);
//        return logWorkRepository.save(entity);
//    }
//
//    @Override
//    public List<LogWorkEntity> add(List<LogWorkDto> dtoList) {
//>>>>>>> 1cf75d5bb53235ee7c96d3d78f7bff406952f058
//        return null;
//    }
//
//    @Override
//<<<<<<< HEAD
//    public LogWorkEntity update(LogWorkModel model) {
//        return null;
//=======
//    public LogWorkEntity update(LogWorkDto dto) {
//        if(logWorkRepository.findById(dto.getId()).isPresent()){
//            LogWorkModel model = LogWorkDto.dtoToModel(dto);
//            LogWorkEntity entity = this.modelToEntity(model);
//            return logWorkRepository.save(entity);
//        }else {
//            return null;
//        }
//>>>>>>> 1cf75d5bb53235ee7c96d3d78f7bff406952f058
//    }
//
//    @Override
//    public boolean deleteById(Long id) {
//<<<<<<< HEAD
//        return false;
//    }
//
//    @Override
//    public boolean deleteByIds(List<Long> id) {
//        return false;
//=======
//        if(logWorkRepository.findById(id).isPresent()){
//            logWorkRepository.deleteById(id);
//            return true;
//        }else {
//            return false;
//        }
//    }
//
    public List<LogWorkDto> getAllLogWorkByUserId(long userId){
        List<LogWorkModel> logWorkModels = iLogWorkRepository.getLogWorkEntityByUserId(userId).stream().map(
                (logWorkEntity) -> this.entityToModel(logWorkEntity)
        ).collect(Collectors.toList());
        List<LogWorkDto> logWorkDtos = logWorkModels.stream().map(
                (logWorkModel) -> LogWorkModel.modelToDto(logWorkModel)).collect(Collectors.toList());
        return logWorkDtos;
    }

    private LogWorkEntity modelToEntity(LogWorkModel model){
        LogWorkEntity entity = new LogWorkEntity();
        entity.setId(model.getId());
        entity.setDay(model.getDay());
        entity.setMonth(model.getMonth());
        entity.setYear(model.getYear());
        entity.setStartTime(model.getStartTime());
        entity.setEndTime(model.getEndTime());
        entity.setWorkTime(model.getWorkTime());
        entity.setOverTime(model.getOverTime());
        entity.setUserEntity(iUserRepository.findById(model.getUserId()).get());
        entity.setRequestEntityList(model.getRequestIds().stream().map(
                (id) -> iRequestRepository.findById(id).get()
        ).collect(Collectors.toList()));
        return entity;
    }

    public LogWorkModel entityToModel(LogWorkEntity entity){
        LogWorkModel model = new LogWorkModel();
        model.setId(entity.getId());
        model.setDay(entity.getDay());
        model.setMonth(entity.getMonth());
        model.setYear(entity.getYear());
        model.setStartTime(entity.getStartTime());
        model.setEndTime(entity.getEndTime());
        model.setWorkTime(entity.getWorkTime());
        model.setOverTime(entity.getOverTime());
        model.setUserId(entity.getUserEntity().getId());
        model.setRequestIds(entity.getRequestEntityList().stream().map(
                (requestEntity) -> requestEntity.getId()
        ).collect(Collectors.toList()));
        return model;
    }
}
