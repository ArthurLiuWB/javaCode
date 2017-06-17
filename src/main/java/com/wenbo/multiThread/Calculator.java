package com.wenbo.multiThread;

/**
 * Created by Arthur on 2017/6/17.
 */
public class Calculator implements Runnable{
    private int number;
    public Calculator(int number) {
        this.number = number;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + number + " * " + i + " = " + number * i);
        }
    }
}
