package homework0804.pizza.drink;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请选择饮料：1咖啡、3矿泉水、2可乐：");
        int select = input.nextInt();
        Drink drink = Buy.buyAndSelect(select);

    }
}
