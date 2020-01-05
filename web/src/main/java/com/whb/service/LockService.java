package com.whb.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LockService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LockService.class);


    public void test() {
        LOGGER.info(Thread.currentThread().getName());

    }


}
