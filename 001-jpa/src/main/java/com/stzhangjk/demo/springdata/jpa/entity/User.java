package com.stzhangjk.demo.springdata.jpa.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Entity
@Table(name = "user")
public class User extends BaseEntity<User> {

    /** 姓名 */
    @Column(name = "name", nullable = false)
    private String name;

    /** 性别 */
    @Column(name = "gender", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Gender gender;

    /** 邮箱 */
    @Column(name = "email", nullable = false)
    private String email;

    @Getter
    public enum Gender {
        MALE("男"), FEMALE("女");

        private String desc;

        Gender(String desc) {
            this.desc = desc;
        }
    }
}


