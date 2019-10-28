package com.jiaozi.threadapi.currentThread;

/**
 * @Description: 测试
 *
 * currentThread 可以返回代码段正在被哪个线程调用的信息。‘
 * currentThread.getName() 调用这个方法的线程的名称
 * this.getName() 即调用父类Thread的方法
 * @Author: xiam
 * @Create: 2019-10-28
 **/
public class TestMain {
    public static void main(String[] args) {
        // MyThread myThread = new MyThread();
        // myThread.run();
        // myThread.start();

        MyThread01 myThread01 = new MyThread01();
        Thread thread = new Thread(myThread01);
        thread.setName("hello");
        thread.start();
    }
}
