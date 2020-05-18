package com.stzhangjk.demo.springdata.jpa.dao;

import com.stzhangjk.demo.springdata.jpa.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends PagingAndSortingRepository<User, Long> {
}
