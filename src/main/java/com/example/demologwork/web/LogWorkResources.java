package com.example.demologwork.web;

import com.example.demologwork.dto.ResponseDTO;
import com.example.demologwork.service.impl.LogWorkServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RequestMapping(value = "/api/logwork")
@RestController
public class LogWorkResources {
    @Autowired
    LogWorkServiceImpl logWorkService;

    @GetMapping(value = "/getAllLogWork")
    public Object getAllLogWork(){
        return ResponseDTO.of(logWorkService.findAll().stream().map((logWorkEntity)
                -> logWorkService.entityToModel(logWorkEntity)).collect(Collectors.toList()),
                "Get all log works");
    }

    @GetMapping(value = "/getLogWorksByUserId")
    public Object getLogWorksByUserId(@RequestParam(value = "userId") String userId){
        try {
            long id = Long.valueOf(userId);
            return ResponseDTO.of(logWorkService.getAllLogWorkByUserId(id), "Get all log works by user id");
        }catch (NumberFormatException ex){
            ex.printStackTrace();
            return null;
        }
    }
}
