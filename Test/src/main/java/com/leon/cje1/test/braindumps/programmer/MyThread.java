package com.leon.cje1.test.braindumps.programmer;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread implements Runnable {
    private static AtomicInteger count = new AtomicInteger(0);
    private static int count2 = 0;

    public void run() {
        int x = count.incrementAndGet();
//        count2 = count2 + 1;
        System.out.print(x + "  ");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        Thread thread3 = new Thread(new MyThread());
        Thread[] ta = { thread1, thread2, thread3 };
        for (int x = 0; x < 3; x++) {
            ta[x].start();
        }
    }
}
