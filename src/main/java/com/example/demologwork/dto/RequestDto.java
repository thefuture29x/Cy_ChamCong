package com.example.demologwork.dto;

import com.example.demologwork.entity.LogWorkEntity;
import com.example.demologwork.entity.RequestEntity;
import com.example.demologwork.model.RequestModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Time;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class RequestDto implements Serializable {
    private long id;
    private String title;
    private String content;
    private Time timeRequest;
    private String status;
    private Long idLogWork;


    public static RequestDto toDto(RequestEntity entity) {
        return RequestDto.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .content(entity.getContent())
                .status(entity.getStatus())
                .timeRequest(entity.getTimeRequest())
                .idLogWork(entity.getLogWork().getId())
                .build();
    }

    public static RequestModel dtoToModel(RequestDto dto){
        RequestModel model = new RequestModel();
        model.setId(dto.getId());
        model.setTitle(dto.getTitle());
        model.setContent(dto.getContent());
        model.setTimeRequest(dto.getTimeRequest());
        return model;
    }
}
