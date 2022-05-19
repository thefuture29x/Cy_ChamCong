package com.example.demologwork.dto;

//import com.example.demologwork.model.Request;
import com.example.demologwork.model.LogWorkModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.List;
import java.util.stream.Collectors;

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
    private Long userId;
    private List<Long> requestIds;

    public static LogWorkModel dtoToModel(LogWorkDto dto){
        LogWorkModel model = new LogWorkModel();
        model.setId(dto.getId());
        model.setDay(dto.getDay());
        model.setMonth(dto.getMonth());
        model.setYear(dto.getYear());
        model.setStartTime(Time.valueOf(dto.getStartTime()));
        model.setEndTime(Time.valueOf(dto.getEndTime()));
        model.setWorkTime(Time.valueOf(dto.getWorkTime()));
        model.setOverTime(Time.valueOf(dto.getOverTime()));
        model.setUserId(dto.getUserId());
        model.setRequestIds(dto.getRequestIds());
        return model;
    }
}
