package com.stzhangjk.demo.springdata.jpa.service;

import com.stzhangjk.demo.springdata.jpa.entity.User;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService extends BaseService<User, Long> {

    public UserService(SimpleJpaRepository<User, Long> repo) {
        super(repo);
    }

    @Transactional
    public User add(User dto){
        return repo.save(dto);
    }
}
