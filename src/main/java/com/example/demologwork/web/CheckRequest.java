package com.example.demologwork.web;

import com.example.demologwork.dto.RequestDto;
import com.example.demologwork.dto.ResponseDTO;
import com.example.demologwork.entity.RequestEntity;
import com.example.demologwork.model.RequestModel;
import com.example.demologwork.repository.IRequestRepository;
import com.example.demologwork.service.RequestService;
import com.example.demologwork.service.impl.RequestServiceImpl;
import com.example.demologwork.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkrequest")
public class CheckRequest {
    @Autowired
    IRequestRepository requestRepository;
    @Autowired
    RequestServiceImpl requestService;
    @GetMapping
    @Transactional
    public Object getRequest(){
        return ResponseDTO.of(this.requestRepository.findAll().stream().map(ans -> RequestDto.toDto(ans)), "Get all");
    }
    @PostMapping
    @Transactional
    public Object addRequest(@RequestBody RequestModel requestModel){
        RequestDto requestDto = RequestDto.toDto(requestService.add(requestModel));
        return ResponseDTO.of(requestDto,"add");
    }
    @PatchMapping(value = "{id}")
    @Transactional

    public Object updateQuestion(@PathVariable Long id,@RequestBody RequestModel requestModel){
        requestModel.setId(id);
        RequestDto questionDto = RequestDto.toDto(requestService.update(requestModel));
        return ResponseDTO.of(questionDto,"update");
    }

}
