package com.stzhangjk.demo.springdata.jpa.dao;

import com.stzhangjk.demo.springdata.jpa.entity.Shop;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopDAO extends PagingAndSortingRepository<Shop, Long> {
}
