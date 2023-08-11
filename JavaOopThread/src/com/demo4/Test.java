package com.demo4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        numCallAble numCallAble = new numCallAble();
        FutureTask futureTask = new FutureTask(numCallAble);//中间过渡
        Thread thread = new Thread(futureTask,"子线程");
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "正在运行" + i);
        }

        Object obj = futureTask.get();//获得Callable线程方法的返回值
        System.out.println("返回值是："+obj);
    }
}
