package com.jiaozi.threadapi.currentThread;


/**
 * @Description: 测试Thread
 * @Author: xiam
 * @Create: 2019-10-28
 **/
public class MyThread01 extends Thread {

    public MyThread01(){
        System.out.println("构造方法currentThread："+ Thread.currentThread().getName());
        System.out.println("构造方法this："+ this.getName());
    }
    @Override
    public void run() {
        System.out.println("Run方法 currentThread："+ Thread.currentThread().getName());
        System.out.println("Run方法 this："+ this.getName());

    }
}
