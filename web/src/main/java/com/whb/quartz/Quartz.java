package com.whb.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Quartz {

    public  void quartz() {
        System.out.println("cron"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }


    public  void quartz2() {
        System.out.println("initialDelay"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }
}
