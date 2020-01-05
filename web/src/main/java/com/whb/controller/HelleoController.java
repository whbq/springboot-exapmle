package com.whb.controller;

import com.whb.service.LockService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Api
@RestController
public class HelleoController {


    private static final Logger LOGGER = LoggerFactory.getLogger(HelleoController.class);

    @Autowired
    private  LockService lockService;


    @ApiOperation(value = "hello", notes = "hello")
    @GetMapping ("hello")
    public Map hello(String target) {
        Map data = new HashMap(2 << 1);
        lockService.test();
        return  data;
    }


}
