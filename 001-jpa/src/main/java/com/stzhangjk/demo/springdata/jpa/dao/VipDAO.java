package com.stzhangjk.demo.springdata.jpa.dao;

import com.stzhangjk.demo.springdata.jpa.entity.Vip;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VipDAO extends PagingAndSortingRepository<Vip, Long> {
}
