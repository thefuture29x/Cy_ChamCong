package com.example.demologwork.model;

import com.example.demologwork.dto.RequestDto;
import com.example.demologwork.entity.RequestEntity;
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

    public static RequestModel toDto(RequestEntity entity) {
        return RequestModel.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .content(entity.getContent())
                .timeRequest(entity.getTimeRequest())
                .build();

    }

    public static RequestEntity toEnity(RequestModel model) {
        return RequestEntity.builder()
                .id(model.getId())
                .title(model.getTitle())
                .content(model.getContent())
                .timeRequest(model.getTimeRequest())
                .build();

    }

}
