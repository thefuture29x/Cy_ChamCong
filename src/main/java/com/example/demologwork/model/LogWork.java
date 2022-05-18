package com.example.demologwork.model;

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
public class LogWork {
    private long id;
    private int day;
    private int month;
    private int year;
    private Time startTime;
    private Time endTime;
    private Time workTime;
    private Time overTime;
    private User userModel;
    private List<Request> requestList;
}
