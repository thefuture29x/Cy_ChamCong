package com.example.demologwork.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "request")
public class RequestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;
    @Column(name = "timerequest")
    private Time timeRequest;
    private String status;

    @JsonIgnoreProperties(value = "requestEntityList")
    @ManyToOne
    @JoinColumn(name = "id_logwork")
    private LogWorkEntity logWork;
}
