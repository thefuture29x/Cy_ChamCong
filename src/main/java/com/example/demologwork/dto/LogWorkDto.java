package com.example.demologwork.dto;

import com.example.demologwork.entity.LogWorkEntity;
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
    private Time startTime;
    private Time endTime;
    private Time workTime;
    private Time overTime;
    private UserDto userDto;
    private List<RequestDto> requestList;

    public static LogWorkDto toDto(LogWorkEntity entity) {
        return LogWorkDto.builder()
                .id(entity.getId())
                .day(entity.getDay())
                .month(entity.getMonth())
                .year(entity.getYear())
                .startTime(entity.getStartTime())
                .endTime(entity.getEndTime())
                .workTime(entity.getWorkTime())
                .overTime(entity.getOverTime())
                .requestList(entity.getRequestEntityList() != null ? entity.getRequestEntityList().stream().map(RequestDto::toDto).collect(Collectors.toList()) : null)
                .build();
    }
}
