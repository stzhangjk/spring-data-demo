package com.stzhangjk.demo.springdata.jpa.config;

import com.stzhangjk.demo.springdata.jpa.dao.ShopDAO;
import com.stzhangjk.demo.springdata.jpa.entity.Shop;
import com.stzhangjk.demo.springdata.jpa.entity.User;
import com.stzhangjk.demo.springdata.jpa.entity.Vip;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import javax.persistence.EntityManager;

@Configuration
@EnableSpringDataWebSupport
@EnableJpaRepositories(basePackageClasses = ShopDAO.class)
public class SpringDataConfig {
    @Bean
    public SimpleJpaRepository<Shop, Long> shopRepo(EntityManager em){
        return new SimpleJpaRepository<>(Shop.class, em);
    }

    @Bean
    public SimpleJpaRepository<Vip, Long> vipRepo(EntityManager em){
        return new SimpleJpaRepository<>(Vip.class, em);
    }

    @Bean
    public SimpleJpaRepository<User, Long> userRepo(EntityManager em){
        return new SimpleJpaRepository<>(User.class, em);
    }
}
