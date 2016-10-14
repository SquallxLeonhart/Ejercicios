package com.leon.cje1.test.braindumps.programmer;

import java.util.concurrent.CyclicBarrier;

public class Worker extends Thread {
    CyclicBarrier cb;

    public Worker(CyclicBarrier cb) {
        this.cb = cb;
    }

    public void run() {
        try {
            cb.await();
            System.out.println("Worker…");
        } catch (Exception ex) {
        }
    }
    
    public static void main(String[] args) {
      Master master = new Master();
      //line n2
      CyclicBarrier cb = new CyclicBarrier(1, master);
      Worker worker = new Worker(cb);
      worker.start();
    }
}

class Master implements Runnable { // line n1
    public void run() {
        System.out.println("Master…");

    }
}