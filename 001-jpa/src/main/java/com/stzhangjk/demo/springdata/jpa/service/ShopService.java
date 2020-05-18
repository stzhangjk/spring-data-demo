package com.stzhangjk.demo.springdata.jpa.service;

import com.stzhangjk.demo.springdata.jpa.entity.Shop;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ShopService extends BaseService<Shop, Long> {

    public ShopService(SimpleJpaRepository<Shop, Long> repo) {
        super(repo);
    }
}
