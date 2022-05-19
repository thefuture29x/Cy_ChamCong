package com.example.demologwork.model;

import com.example.demologwork.dto.LogWorkDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LogWorkModel {
    private long id;
    private int day;
    private int month;
    private int year;
    private Time startTime;
    private Time endTime;
    private Time workTime;
    private Time overTime;
    private Long userId;
    private List<Long> requestIds;

    public static LogWorkDto modelToDto(LogWorkModel model){
        LogWorkDto dto = new LogWorkDto();
        dto.setId(model.getId());
        dto.setDay(model.getDay());
        dto.setMonth(model.getMonth());
        dto.setYear(model.getYear());
        dto.setStartTime(model.getStartTime().toString());
        dto.setEndTime(model.getEndTime().toString());
        dto.setWorkTime(model.getWorkTime().toString());
        dto.setOverTime(model.getOverTime().toString());
        dto.setUserId(model.getUserId());
        dto.setRequestIds(model.getRequestIds());
        return dto;
    }
}
