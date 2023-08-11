package homework0804.pizza.drink;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Buy {


    public static Drink buyAndSelect(int select){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入购买容量");
        double ingredient = input.nextInt();
        switch (select){
            case 1:
                System.out.println("选择：加糖、加奶、什么都不加");
                String addition = input.next();
                return new Coffee("Coffee",ingredient,addition).showInfo();
            case 2:
                System.out.println("可口可乐 还是 百事可乐");
                String select1 = input.next();
                return new Cola("CocoCola",ingredient,select1).showInfo();
            case 3:
                return new Water("农夫山泉",ingredient).showInfo();
        }
        return null;
    }

}
