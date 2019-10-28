package com.jiaozi.threadapi.interrupt;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @Description: 线程的中断
 * @Author: xiam
 * @Create: 2019-09-03
 **/
public class ThreadInterrupt01 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->
                IntStream.range(1,100000)
                        .forEach(i-> System.out.println(Thread.currentThread().getName()+"-->"+i)));
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        thread.interrupt();
       // System.out.println("1/沉睡："+thread.interrupted());
       // System.out.println("2/沉睡："+thread.interrupted());
        System.out.println("1/沉睡："+thread.isInterrupted());
        System.out.println("2/沉睡："+thread.isInterrupted());

    }
}
