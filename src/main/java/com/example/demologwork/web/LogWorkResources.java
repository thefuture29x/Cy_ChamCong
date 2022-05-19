package com.example.demologwork.web;

import com.example.demologwork.dto.ResponseDTO;
import com.example.demologwork.model.LogWorkModel;
import com.example.demologwork.service.impl.LogWorkServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RequestMapping(value = "/v1/api/logwork")
@RestController
public class LogWorkResources {
    @Autowired
    LogWorkServiceImpl logWorkService;

    @PostMapping
    public Object saveLogWork(@RequestBody LogWorkModel logWorkModel){
        return ResponseDTO.of(logWorkService.add(logWorkModel),"Save logwork");
    }

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
