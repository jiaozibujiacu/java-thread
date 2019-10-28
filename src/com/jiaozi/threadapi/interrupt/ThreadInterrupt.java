package com.jiaozi.threadapi.interrupt;


/**
 * @Description: interrupt 线程的打断
 *
 * @Author: xiam
 * @Create: 2019-09-03
 **/
public class ThreadInterrupt {

    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().interrupt();
        System.out.println("1.线程是否中断："+Thread.interrupted());
        System.out.println("2.线程是否中断："+Thread.interrupted());
        System.out.println("end......");
    }
}
