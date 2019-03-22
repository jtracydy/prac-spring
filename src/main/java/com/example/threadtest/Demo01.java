/*
*  2019 
*/
package com.example.threadtest;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wangdan Date: 2019/3/22 Time: 15:59
 * @version $Id$
 */
public class Demo01 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(5));

        for (int i = 0; i < 15; i++) {
            executor.execute(new MyCompute(i));
            System.out.println("线程池中线程数目：" + executor.getPoolSize() + "，队列中等待执行的任务数目：" +
                    executor.getQueue().size() + "，已执行玩别的任务数目：" + executor.getCompletedTaskCount());
        }
        executor.shutdown();
    }
}

class MyCompute implements Runnable {

    private int i;

    public MyCompute(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("正在执行task " + i);
        try {
            Thread.currentThread().sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}