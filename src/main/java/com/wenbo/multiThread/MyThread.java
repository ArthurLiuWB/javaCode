package com.wenbo.multiThread;

/**
 * Created by Arthur on 2017/6/18.
 */
public class MyThread extends Thread{
    int number;
    public MyThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < number; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
//            try {
//                //Thread.sleep(1000);
//                Thread.yield();//暂停执行当前线程，先执行其它线程。让多个线程的执行，更加和谐，但是不能保证一人一次地执行。
//            } catch(Exception e) {
//                e.printStackTrace();
//            }
        }
    }
}
