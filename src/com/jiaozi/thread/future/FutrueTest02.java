package com.jiaozi.thread.future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;



/**
 * @Description:
 * @Author: xiam
 * @Create: 2019-08-27
 **/
public class FutrueTest02 {
    public static void main(String[] args) {

        int taskSize = 5;
        ExecutorService executorService = Executors.newFixedThreadPool(taskSize);
        // List<Future<Integer>> futureList = new ArrayList<>();
        CompletionService completionService = new ExecutorCompletionService(executorService);
        for (int i = 0; i < taskSize; i++) {
//            Future<Integer> futureTask =  executorService.submit(new ReturnAfterCallable(i,i));
//            futureList.add(futureTask);
            completionService.submit(new ReturnAfterCallable(i,i));
        }

        try {
            for(int i = 0;i <taskSize;i++){
                System.out.println(completionService.take().get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }


    }
}
