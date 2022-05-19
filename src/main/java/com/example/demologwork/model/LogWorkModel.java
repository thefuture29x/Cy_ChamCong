package com.example.demologwork.model;

import com.example.demologwork.dto.LogWorkDto;
import com.example.demologwork.dto.RequestDto;
import com.example.demologwork.entity.LogWorkEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.List;
import java.util.stream.Collectors;

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
    private UserModel userModel;
    private List<RequestModel> requestList;

    public static LogWorkModel toDto(LogWorkEntity entity) {
        return LogWorkModel.builder()
                .id(entity.getId())
                .day(entity.getDay())
                .month(entity.getMonth())
                .year(entity.getYear())
                .startTime(entity.getStartTime())
                .endTime(entity.getEndTime())
                .workTime(entity.getWorkTime())
                .overTime(entity.getOverTime())
                .requestList(entity.getRequestEntityList() != null ? entity.getRequestEntityList().stream().map(RequestModel::toDto).collect(Collectors.toList()) : null)
                .build();
    }

    public static LogWorkEntity toEntity(LogWorkModel model) {
        return LogWorkEntity.builder()
                .id(model.getId())
                .day(model.getDay())
                .month(model.getMonth())
                .year(model.getYear())
                .startTime(model.getStartTime())
                .endTime(model.getEndTime())
                .workTime(model.getWorkTime())
                .overTime(model.getOverTime())
                .requestEntityList(model.getRequestList() != null ? model.getRequestList().stream().map(RequestModel::toEnity).collect(Collectors.toList()) : null)
                .build();
    }
    private Long userId;
    private List<Long> requestIds;

    public static LogWorkDto modelToDto(LogWorkModel model){
        LogWorkDto dto = new LogWorkDto();
        dto.setId(model.getId());
        dto.setDay(model.getDay());
        dto.setMonth(model.getMonth());
        dto.setYear(model.getYear());
        dto.setStartTime(model.getStartTime());
        dto.setEndTime(model.getEndTime());
        dto.setWorkTime(model.getWorkTime());
        dto.setOverTime(model.getOverTime());
        dto.setUserId(model.getUserId());
        dto.setRequestIds(model.getRequestIds());
        return dto;
    }
}
