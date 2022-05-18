package com.example.demologwork.dto;

<<<<<<< HEAD
import com.example.demologwork.entity.LogWorkEntity;
=======
import com.example.demologwork.model.Request;
import com.example.demologwork.model.User;
>>>>>>> 2a1d0a17504a62678809110d73cda4ee4eae45eb
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
<<<<<<< HEAD

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LogWorkDto {
    private Long id;
    private Integer day;
    private Integer month;
    private Integer year;
    private Time startTime;
    private Time endTime;
    private Time workTime;
    private Time overTime;
    public static LogWorkDto EntityToDto(LogWorkEntity logWorkEntity){

    }
=======
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class LogWorkDto {
    private long id;
    private int day;
    private int month;
    private int year;
    private String startTime;
    private String endTime;
    private String workTime;
    private String overTime;
    private UserDto userDto;
    private List<RequestDto> requestList;
>>>>>>> 2a1d0a17504a62678809110d73cda4ee4eae45eb
}
