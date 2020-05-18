package com.stzhangjk.demo.springdata.jpa.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "vip")
public class Vip extends BaseEntity<Vip> {

    /** 店铺 */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "shop_id", nullable = false)
    private Shop shop;

    /** 用户 */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    /** 店铺积分 */
    @Column(name = "integral", nullable = false)
    private Integer integral;
}
