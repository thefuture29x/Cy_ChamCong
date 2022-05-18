package com.example.demologwork.web;

import com.example.demologwork.dto.RequestDto;
import com.example.demologwork.dto.ResponseDTO;
import com.example.demologwork.repository.IRequestRepository;
import com.example.demologwork.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/leader")
public class LeaderResource {
    @Autowired
    IRequestRepository requestRepository;
    @GetMapping
    @Transactional
    public Object getRequest(){
        return ResponseDTO.of(this.requestRepository.findAll().stream().map(ans -> RequestDto.EntityToDto(ans)), "Get all"))
    }
   /* public Object getQuestions(Pageable pageable) {
        return ResponseDto.of(this.questionService.findAll(pageable).map(ans -> QuestionDto.EntityToDto(ans)), "Get all");
    }*/
}
