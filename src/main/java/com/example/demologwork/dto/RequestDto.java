package com.example.demologwork.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class RequestDto {
    private long id;
    private String title;
    private String content;
    private Time timeRequest;
}
