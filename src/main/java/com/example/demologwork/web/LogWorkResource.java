package com.example.demologwork.web;


import com.example.demologwork.dto.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logwork")
public class LogWorkResource {
    @Autowired


    @PostMapping
    public Object saveLogWork(){

        return ResponseDTO.of(null,"Save logwork");
    }

}
