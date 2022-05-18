package com.example.demologwork.web;


import com.example.demologwork.dto.ResponseDTO;
import com.example.demologwork.model.LogWorkModel;
import com.example.demologwork.service.ILogWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logwork")
public class LogWorkResource {
    @Autowired
    ILogWorkService iLogWorkService;

    @PostMapping
    public Object saveLogWork(@RequestBody LogWorkModel logWorkModel){
        return ResponseDTO.of(iLogWorkService.add(logWorkModel),"Save logwork");
    }


}
