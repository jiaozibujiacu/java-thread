package com.jiaozi.threadapi.join;

import java.util.stream.IntStream;

/**
 * @Description: join
 * @Author: xiam
 * @Create: 2019-09-03
 **/
public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread thread01 = new Thread(()->
                IntStream.range(1,1000).forEach(i-> System.out.println(Thread.currentThread().getName()+"-->"+i))
        );

        Thread thread02 = new Thread(()->
                IntStream.range(1,1000).forEach(i-> System.out.println(Thread.currentThread().getName()+"-->"+i))
        );
        thread01.start();
        thread02.start();
        // 线程就绪才join
        thread01.join();
        thread02.join();
        IntStream.range(0,1000).forEach(i->
                System.out.println(Thread.currentThread().getName()+"-->"+i));
    }
}
