package com.example.demologwork.model;

import com.example.demologwork.dto.LogWorkDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Request {
    private long id;
    private String title;
    private String content;
    private String timeRequest;
    private boolean status;
    private LogWork logWork;
}
