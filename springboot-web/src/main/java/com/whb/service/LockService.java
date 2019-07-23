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
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

@Service
public class LockService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LockService.class);


    @Resource
    private DLockGenerator lockGenerator;

  //  @Scheduled(cron="*/6 * * * * ?")
    void  tryLock(){

        Lock lock = lockGenerator.gen("FAKE_LOCK", "A_TARGET", 1, TimeUnit.SECONDS);lock.lock();
        if (lock.tryLock()){
             lock.unlock();
            boolean b = lock.tryLock();
            LOGGER.error("tryLock:{}"+b);
            lock.unlock();
        }else {
            lock.lock();
        }

    }


//   @Scheduled(initialDelay=1000, fixedRate=50)
    void  lock(){
//       double random = Math.random();
      //从1到10的int型随数
     Integer  random =   (int)(1+Math.random()*(10-1+1)) ;

       Lock lock = lockGenerator.gen("FAKE_LOCK", "A_TARGET"+ random, 1, TimeUnit.SECONDS);
       LOGGER.info("random:{}"+random);

       boolean b = lock.tryLock();
       LOGGER.error("tryLock:{}"+b);
       if (b) {
           LOGGER.error("tryLock:{}==========>>>>>"+b);

           try {
                doYourWork();
            } finally {
              //  lock.unlock();
                LOGGER.info("unlock:{}"+random);

            }
        } else {
            System.out.println("lock status");
            //lock.unlock();
        }
    }


//    @Scheduled(initialDelay=3000, fixedRate=500)
    void  lock2(){
        Integer  random =   (int)(1+Math.random()*(10-1+1)) ;
        Lock lock = lockGenerator.gen("FAKE_LOCK", "A_TARGET"+ random, 1, TimeUnit.SECONDS);
        LOGGER.info("random:{}"+random);
        boolean b = lock.tryLock();
        LOGGER.error("tryLock:{}"+b);
        if (b) {
            LOGGER.error("tryLock:{}==========>>>>>"+b);

            try {
                doYourWork();
            } finally {
               // lock.unlock();
                LOGGER.info("unlock:{}"+random);

            }
        } else {
            System.out.println("lock status");
            //lock.unlock();
        }
    }




    private void doYourWork() {
        System.out.println("Just do your work");
    }
}
