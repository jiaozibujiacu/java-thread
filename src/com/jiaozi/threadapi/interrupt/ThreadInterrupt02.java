package com.jiaozi.threadapi.interrupt;

import java.util.concurrent.TimeUnit;

/**
 * @Description: 线程的中断
 * @Author: xiam
 * @Create: 2019-09-04
 **/
public class ThreadInterrupt02 {
    public static void main(String[] args) {
        try {
        Thread t = new Thread(){
            @Override
            public void run() {
                while (true){
                    System.out.println("-------");
                }
            }
        };
        t.start();
        TimeUnit.SECONDS.sleep(1);
        t.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
