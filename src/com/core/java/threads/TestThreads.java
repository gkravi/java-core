package com.core.java.threads;

public class TestThreads {

    public static void main(String[] args) {
        FooRunnable r = new FooRunnable();
        Thread t = new Thread(r);
        System.out.println("Is Thread Alive: " + t.isAlive());
        //Once thread invoke start() method then thread is alive
        t.start();

        //After execution of run() method is done then thread is considered dead.
        System.out.println("Is Thread Alive: " + t.isAlive());
    }
}

class  FooRunnable implements Runnable {


    @Override
    public void run() {
        for (int x =1; x <6; x++){
            System.out.println("Running running");
        }

    }
}

