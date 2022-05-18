package com.example.demologwork.dto;

import com.example.demologwork.entity.LogWorkEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

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
}
