package com.example.demologwork.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class RequestModel {
    private Long id;
    private String title;
    private String content;
    private Time timeRequest;
    private String status;
    private Long idLogWork;
}
