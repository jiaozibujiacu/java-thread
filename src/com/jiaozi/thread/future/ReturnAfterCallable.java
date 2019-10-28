package com.jiaozi.thread.future;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: xiam
 * @Create: 2019-08-27
 **/
public class ReturnAfterCallable implements Callable<Integer> {

    private int sleepSeconds;

    private int returnValue;

    public ReturnAfterCallable(int sleepSeconds, int returnValue) {
        this.sleepSeconds = sleepSeconds;
        this.returnValue = returnValue;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" begin ......");
        if(sleepSeconds==3){
            TimeUnit.SECONDS.sleep(6);
        }
        TimeUnit.SECONDS.sleep(sleepSeconds);
        return returnValue;
    }

}
