package com.whb.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

public class IBookService {

    private  final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Scheduled(cron = "*/1 * * * * ?")
    public  void getBook() {
        LOGGER.info(System.currentTimeMillis()+"");
    }

}
