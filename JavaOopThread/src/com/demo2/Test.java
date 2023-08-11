package com.demo2;

public class Test {
    public static void main(String[] args) {
        Station station01 = new Station();
        station01.setName("窗口1");
        station01.start();
        Station station02 = new Station("窗口2");
        station02.start();
        Station station03 = new Station("窗口3");
        station03.start();
    }
}
