package com.example.demologwork.dto;

import com.example.demologwork.entity.LogWorkEntity;
import com.example.demologwork.entity.RequestEntity;
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
    private Boolean status;
    private LogWorkEntity logWork;
    public static RequestDto EntityToDto(RequestEntity requestEntity) {
        return RequestDto.builder()
                .id(requestEntity.getId())
                .title(requestEntity.getTitle())
                .content(requestEntity.getContent())
                .timeRequest(requestEntity.getTimeRequest())
                .status(requestEntity.getStatus())
               // .logWork(requestEntity.getLogWork().)
                //  .anses(questionEntity.getListaAnswerEntity() != null ? questionEntity.getListaAnswerEntity().stream().map(AnswerDto::EntityToDto).collect(java.util.stream.Collectors.toList()) : null)
                .build();
    }
}
