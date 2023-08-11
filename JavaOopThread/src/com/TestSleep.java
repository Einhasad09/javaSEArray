package com;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestSleep {
    public static void main(String[] args) throws InterruptedException {

        while(true){
            Thread.sleep(1000);
            System.out.println(LocalDateTime.now());
        }
        /*for (int i = 0; i < 10; i++) {
            System.out.println("hello world");
            Thread.sleep(1000);//毫秒
        }*/
    }
}
