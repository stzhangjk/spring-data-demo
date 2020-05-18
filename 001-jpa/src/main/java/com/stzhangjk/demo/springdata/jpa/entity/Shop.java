package com.stzhangjk.demo.springdata.jpa.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import java.util.Date;


@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "shop")
@EntityListeners(AuditingEntityListener.class)
public class Shop extends BaseEntity<Shop> {

    /** 店铺名称 */
    @Column(name = "title", nullable = false)
    private String title;

    /** 店主昵称 */
    @Column(name = "name", nullable = false)
    private String name;

    /** 开店时间 */
    @Column(name = "open_time")
    private Date openTime;
}
