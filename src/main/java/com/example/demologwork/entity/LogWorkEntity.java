package com.example.demologwork.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.sql.Time;
import java.util.List;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "logwork")
public class LogWorkEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer day;
    private Integer month;
    private Integer year;
    @Column(name = "starttime")
    private Time startTime;
    @Column(name = "endtime")
    private Time endTime;
    @Column(name = "worktime")
    private Time workTime;
    @Column(name = "overtime")
    private Time overTime;

    @JsonIgnoreProperties(value = "logWorkEntities")
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

    @JsonIgnoreProperties(value = "logWork")
    @OneToMany(mappedBy = "logWork")
    private List<RequestEntity> requestEntityList;
}
