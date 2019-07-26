package com.whb.controller;

import com.whb.dlock.support.DLockGenerator;
import com.whb.service.LockService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

@Api
@RestController
public class HelleoController {


    private static final Logger LOGGER = LoggerFactory.getLogger(HelleoController.class);

    @Autowired
    private  LockService lockService;

    @Resource
    private DLockGenerator lockGenerator;
    @ApiOperation(value = "hello", notes = "hello")
    @GetMapping ("hello")
    public Map hello(String target) {
        Map data = new HashMap(2 << 1);
        lockService.test();
        return  data;
    }
    @ApiOperation(value = "testDlock", notes = "testDlock")
    @GetMapping("testDlock")
    public Map testDlock(String target) throws InterruptedException {
        Map data = new HashMap(2 << 1);

        Lock lock = lockGenerator.gen("FAKE_LOCK", target, 10, TimeUnit.SECONDS);
        if (lock.tryLock()){
            data.put("data",true);
            lock.unlock();
        }else {
            data.put("data",false);
        }
        return  data;
    }

}
