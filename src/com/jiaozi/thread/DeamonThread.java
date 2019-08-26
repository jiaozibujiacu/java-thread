package com.jiaozi.thread;

/**
 * @Description: 守护线程
 * @Author: xiam
 * @Create: 2019-08-26
 *  main线程为user Thread (用户线程) 当非守护线程结束时,守护线程就会结束
 *  存在任何一个非守护线程在工作时,守护线程就全部工作
 **/
public class DeamonThread {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"try do.....");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"do over......");
        },"deamon-thread");
         thread.setDaemon(true);
        thread.start();
        try {
            Thread.sleep(2_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" over");
    }

}
