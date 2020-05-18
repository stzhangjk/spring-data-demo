package com.stzhangjk.demo.springdata.jpa.service;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

public class BaseService<T, ID> {

    protected SimpleJpaRepository<T, ID> repo;

    public BaseService(SimpleJpaRepository<T, ID> repo) {
        this.repo = repo;
    }
}
