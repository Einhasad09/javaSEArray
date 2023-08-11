package day0803.duotai.super02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要的包");
        int i = input.nextInt();
        Factory factory = new Factory();
        Bag bag = factory.makeBag(i);
        bag.showInfo();
        if(bag instanceof SchoolBag){
            ((SchoolBag)bag).showInfo();
        }

    }

}
