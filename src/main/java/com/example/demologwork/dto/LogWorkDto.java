package com.example.demologwork.dto;

//import com.example.demologwork.model.Request;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
