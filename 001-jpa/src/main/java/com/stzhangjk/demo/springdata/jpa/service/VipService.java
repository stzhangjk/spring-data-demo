package com.stzhangjk.demo.springdata.jpa.service;

import com.stzhangjk.demo.springdata.jpa.dto.VipSearchDTO;
import com.stzhangjk.demo.springdata.jpa.entity.Vip;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class VipService extends BaseService<Vip, Long> {

    public VipService(SimpleJpaRepository<Vip, Long> repo) {
        super(repo);
    }

    public Page<Vip> list(VipSearchDTO dto) {
        return null;
    }
}
