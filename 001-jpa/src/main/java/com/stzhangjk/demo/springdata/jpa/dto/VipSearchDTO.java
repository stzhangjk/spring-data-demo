package com.stzhangjk.demo.springdata.jpa.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class VipSearchDTO {
    private Date createTimeFrom;
    private Date createTimeTo;
    private Integer integralFrom;
    private Integer integralTo;
    private Integer page;
    private Integer size;
}
