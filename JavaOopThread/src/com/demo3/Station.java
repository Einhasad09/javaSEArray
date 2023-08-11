package com.demo3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Station implements Runnable{
    private static int ticket = 10;

    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            lock.lock();
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+"卖出一张票，此时票数为："+(ticket--));
            }
            lock.unlock();
        }
    }
}
