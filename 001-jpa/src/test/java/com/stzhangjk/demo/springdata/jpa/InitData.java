package com.stzhangjk.demo.springdata.jpa;

import com.stzhangjk.demo.springdata.jpa.config.SpringDataConfig;
import com.stzhangjk.demo.springdata.jpa.entity.Shop;
import com.stzhangjk.demo.springdata.jpa.entity.User;
import com.stzhangjk.demo.springdata.jpa.entity.Vip;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@Import(SpringDataConfig.class)
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class InitData {

    @Autowired
    private SimpleJpaRepository<Shop, Long> shopRepo;

    @Autowired
    private SimpleJpaRepository<User, Long> userRepo;

    @Autowired
    private SimpleJpaRepository<Vip, Long> vipRepo;

    @Test
    public void addInitData() {

        Shop shop = new Shop()
                .setOpenTime(new Date())
                .setTitle("测试店铺title")
                .setName("测试店铺");
        shop = shopRepo.save(shop);
        log.info(shop.toString());
        LocalDateTime date = LocalDateTime.of(2020, 1, 1, 0, 0, 0);

        for (int i = 0; i < 366; i++, date = date.plusDays(1)) {
            User user = new User()
                    .setGender(i % 2 == 0 ? User.Gender.MALE : User.Gender.FEMALE)
                    .setName(String.valueOf(i))
                    .setEmail(String.format("%s@user.example.com", i));
            user = userRepo.save(user);
            Vip vip = new Vip()
                    .setShop(shop)
                    .setUser(user)
                    .setIntegral(i);
            vip = vipRepo.save(vip);
            log.info(vip.toString());
        }
    }
}
