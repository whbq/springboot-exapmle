package com.whb.controller;

import com.whb.entity.YiwugouPrudetail;
import com.whb.service.EsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private EsService esServiceImpl;

    @GetMapping ("add")
    public void   test() {
        esServiceImpl.add(new YiwugouPrudetail());
    }



    @GetMapping ("selectAll")
    public void   selectAll() {
        esServiceImpl.selectAll();
    }

}
