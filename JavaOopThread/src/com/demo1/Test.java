package com.demo1;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        /*Thread.currentThread().setPriority(4);
        for (int i = 0; i <= 10; i++) {
            System.out.println("main主线程运行"+i);
        }*/

        numberThread numberThread = new numberThread();
        //numberThread.setPriority(9);//设置线程级别
        numberThread.setDaemon(true);
        numberThread.start();

        for (int i = 0; i < 101; i++) {
            /*if(i==10){
                numberThread.join();
            }
            Thread.currentThread().stop();*/
            System.out.println("主线程运行:"+i);
        }
    }
}
