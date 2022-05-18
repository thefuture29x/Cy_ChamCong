package com.example.demologwork.entity;

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
    @ManyToMany(mappedBy = "logWorkEntities")
    private List<UserEntity> userEntities;


    @OneToMany(mappedBy = "logWork")
    private List<RequestEntity> requestEntityList;
}
