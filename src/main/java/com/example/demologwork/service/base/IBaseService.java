package com.example.demologwork.service.base;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

//E: entity, M: model, K: key
public interface IBaseService <E, M, K>{
    List<E> findAll();
    Page<E> findAll(Pageable page);
    E findById(long id);
    E findById(K id);
    E add()
}
