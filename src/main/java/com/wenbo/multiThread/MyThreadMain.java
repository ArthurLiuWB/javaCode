package com.wenbo.multiThread;

/**
 * Created by Arthur on 2017/6/18.
 */
public class MyThreadMain {
    public static void main(String[] args) {
        Thread t1 = new MyThread(100);
        Thread t2 = new MyThread(100);
        Thread t3 = new MyThread(20);

        t1.setName("Arthur");
        t2.setName("King");
//        t3.setName("God");
//
//        t3.start();
//        try {
//            // 等待该线程执行完之后再执行其余线程
//            t3.join();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        t1.start();
        t2.start();

        t1.setDaemon(true); // 设置线程为守护线程
        t2.setDaemon(true);
        //t3.setDaemon(true);

        Thread.currentThread().setName("LiuWenbo");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
