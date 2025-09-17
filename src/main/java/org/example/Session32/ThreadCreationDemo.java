package org.example.Session32;

public class ThreadCreationDemo {
    public static void main(String[] args) {

        //extends Thread
        class MyThread extends Thread{
            @Override
            public void run() {
                System.out.println("1. Thread extended from Thread " + Thread.currentThread().getName());
            }
        }

        Thread t1 = new MyThread();
        t1.start();

        //Implements Runnable
        class MyRunnable implements Runnable {

            @Override
            public void run() {
                System.out.println("2. Thread implemented from Runnable " + Thread.currentThread().getName());
            }
        }
        Thread t2=new Thread(new MyRunnable());
        t2.start();

        //Runnable with lambda
        Thread t3=new Thread(()->System.out.println("3.Thread form runnable with lambda " + Thread.currentThread().getName()));
        t3.start();

        java.util.concurrent.ExecutorService executor= java.util.concurrent.Executors.newFixedThreadPool(2);
        executor.submit(()->System.out.println("4.Thread form ExecutorService " + Thread.currentThread().getName()));
        executor.shutdown();

        //Parallel Stream
        java.util.stream.IntStream.range(1,5).parallel().forEach(i-> System.out.println("5.Thread "+ i+" from stream"+Thread.currentThread().getName()));
    }
}
