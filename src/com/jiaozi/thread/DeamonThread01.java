package com.jiaozi.thread;

import com.jiaozi.base.Son;

/**
 * @Description:
 * @Author: xiam
 * @Create: 2019-08-26
 **/
public class DeamonThread01 {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            Thread innerThread = new Thread(()->{
                System.out.println(Thread.currentThread().getName()+" begin do ......");
                try {
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" over ......");
            },"innner-thread");

            innerThread.setDaemon(true);
            innerThread.start();
            try {
                Thread.sleep(2_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" over");
        });
        thread.setDaemon(true);
        thread.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" over......");
    }
}
