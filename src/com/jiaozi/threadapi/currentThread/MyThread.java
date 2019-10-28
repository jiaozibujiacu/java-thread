package com.jiaozi.threadapi.currentThread;

/**
 * @Description: currentThread使用
 * @Author: xiam
 * @Create: 2019-10-28
 **/
public class MyThread extends Thread {
    public MyThread(){
        System.out.println("构造方法:"+Thread.currentThread().getName());
    }

    @Override
    public void run(){
        System.out.println("run方法:"+Thread.currentThread().getName()+"");
    }

}
