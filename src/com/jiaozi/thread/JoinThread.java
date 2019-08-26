package com.jiaozi.thread;

import java.util.Optional;
import java.util.stream.IntStream;

/**
 * @Description: join
 * @Author: xiam
 * @Create: 2019-08-26
 **/
public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            IntStream.range(1,1000)
                    .forEach(i-> System.out.println(Thread.currentThread().getName()+"->"+i));
        });

        Thread thread2 = new Thread(()->{
            IntStream.range(1,1000)
                    .forEach(i-> System.out.println(Thread.currentThread().getName()+"->"+i));
        });
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        IntStream.range(1,1000)
                .forEach(i-> System.out.println(Thread.currentThread().getName()+"->"+i));

    }
}
