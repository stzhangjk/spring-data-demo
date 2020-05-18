package com.stzhangjk.demo.springdata.jpa.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.stzhangjk.demo.springdata.jpa.enumeration.CodeAndDescEnum;
import com.stzhangjk.demo.springdata.jpa.enumeration.EnumToNumberSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Entity
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
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
    @JsonSerialize(using = EnumToNumberSerializer.class)
    public enum Gender implements CodeAndDescEnum {
        MALE("男"), FEMALE("女");

        private String desc;

        Gender(String desc) {
            this.desc = desc;
        }

        @Override
        public int toCode() {
            return this.ordinal();
        }

        @Override
        public String toDesc() {
            return desc;
        }
    }
}


