package com.whb.service;

import com.whb.dlock.processor.impl.RedisLockProcessor;
import com.whb.dlock.support.DLockGenerator;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

@Service
public class LockService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LockService.class);


    @Resource
    private DLockGenerator lockGenerator;

    public void test1() {
        int random = (int) (Math.random() * 10 + 1);
        //String random = UUID.randomUUID().toString();
        Lock lock = lockGenerator.gen("FAKE_LOCK:" + random, ":A_TARGET" + random, 1, TimeUnit.SECONDS);
        if (lock.tryLock()) {
            System.out.println("锁成功了" + random);
        } else {
            System.out.println("锁失败了" + random);
        }
    }

    public void test() {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                test1();
            }
        }, 1, 30, TimeUnit.MILLISECONDS);
    }


}
