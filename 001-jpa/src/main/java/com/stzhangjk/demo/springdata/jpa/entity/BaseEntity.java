package com.stzhangjk.demo.springdata.jpa.entity;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;


@Getter
@Accessors(chain = true)
@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public class BaseEntity<E> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_time", nullable = false)
    @CreatedDate
    private Date createTime;

    @Column(name = "update_time", nullable = false)
    @LastModifiedDate
    private Date updateTime;

    public E setId(Long id) {
        this.id = id;
        return (E) this;
    }

    public E setCreateTime(Date createTime) {
        this.createTime = createTime;
        return (E) this;
    }

    public E setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return (E) this;
    }
}
