package com.example.demologwork.service.impl;

import com.example.demologwork.entity.LogWorkEntity;
import com.example.demologwork.entity.RequestEntity;
import com.example.demologwork.model.RequestModel;
import com.example.demologwork.repository.ILogWorkRepository;
import com.example.demologwork.repository.IRequestRepository;
import com.example.demologwork.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RequestServiceImpl implements RequestService {
    @Autowired
    ILogWorkRepository iLogWorkRepository;
    @Autowired
    IRequestRepository requestRepository;

    @Override
    public List<RequestEntity> findAll() {
        return null;
    }

    @Override
    public Page<RequestEntity> findAll(Pageable page) {
        return null;
    }

    @Override
    public RequestEntity findById(Long id) {
        return null;
    }

    public RequestEntity toEntity(RequestModel requestModel) {
        RequestEntity requestEntity = new RequestEntity();
        requestEntity.setId(requestModel.getId());
        requestEntity.setTitle(requestModel.getTitle());
        requestEntity.setContent(requestModel.getContent());
        requestEntity.setTimeRequest(requestModel.getTimeRequest());
        requestEntity.setStatus(requestModel.getStatus());
       requestEntity.setLogWork(iLogWorkRepository.findById(requestModel.getIdLogWork()).get());

        return requestEntity;
    }

    @Override
    public RequestEntity add(RequestModel model) {
      /*  LogWorkEntity logWorkEntity = this.iLogWorkRepository.findById(model.getId())
                .orElseThrow(() -> new RuntimeException("Log work not found"));*/
        RequestEntity requestEntity =toEntity(model);
        return requestRepository.save(requestEntity);
    }

    @Override
    public List<RequestEntity> add(List<RequestModel> model) {
        return model.stream().map(this::add).collect(Collectors.toList());
    }

    @Override
    public RequestEntity update(RequestModel model) {
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
