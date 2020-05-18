package com.stzhangjk.demo.springdata.jpa.controller;

import com.stzhangjk.demo.springdata.jpa.dto.VipSearchDTO;
import com.stzhangjk.demo.springdata.jpa.entity.Vip;
import com.stzhangjk.demo.springdata.jpa.service.VipService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vip")
public class VipController {

    @Autowired
    private VipService service;

    @ApiOperation("分页搜索Vip")
    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Page<Vip> list(@RequestBody VipSearchDTO body){
        return service.list(body);
    }
}
