package com.jiaozi.thread.future;

import java.util.concurrent.*;

/**
 * @Description:
 * @Author: xiam
 * @Create: 2019-08-27
 **/
public class FutrueTest01 {
    public static void main(String[] args) {
         //  FutureTask
        // Callable
        //ExecutorService executor = Executors.newCachedThreadPool();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        CompletionService<Integer> completionService = new ExecutorCompletionService<>(executor);
        completionService.submit(() -> 1);
        try {
            completionService.take().get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
