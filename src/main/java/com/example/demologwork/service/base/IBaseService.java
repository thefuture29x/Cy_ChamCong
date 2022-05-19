package com.example.demologwork.service.base;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

//E: entity, D: dto, K: key
public interface IBaseService <E, D, K>{
    List<E> findAll();
    Page<E> findAll(Pageable page);
    E findById(K id);
    E add(D dto);
    List<E> add(List<D> dtoList);
    E update(D dto);
    boolean deleteById(K id);
}
