package com.example.demologwork.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBaseService<T, M, K> {
    List<T> findAll();

    Page<T> findAll(Pageable page);

    T findById(K id);

    T add(M model);

    List<T> add(List<M> model);

    T update(M model);

    boolean deleteById(K id);
    boolean deleteByIds(List<K> id);
}
