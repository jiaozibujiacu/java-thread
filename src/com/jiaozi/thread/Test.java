package com.jiaozi.thread;

/**
 * @Description: 线程测试
 * @Author: xiam
 * @Create: 2019-08-26
 **/
public class Test {
    public static void main(String[] args) {


        // 实现runnable Thread(Runnable runnable)
        Thread thread = new Thread(new MyThread());
        System.out.println(thread.getName());
        System.out.println(Thread.currentThread().getName());
        thread.start();

        // 继承Thread Thread()
        Thread myThread01 = new MyThread01();
        myThread01.start();

        // Thread(Runnable runnable,String threadName)
        Thread thread02 = new Thread(()-> System.out.println("I am thread02"),"Thread-my-02");
        System.out.println(thread02.getName());
        thread02.start();



    }
}
