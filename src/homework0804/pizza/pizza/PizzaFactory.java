package homework0804.pizza.pizza;

import java.util.Scanner;

public class PizzaFactory {

    public static Pizza makePizza(String name){
        Scanner input = new Scanner(System.in);
        if(name.equals("培根披萨")){
            System.out.println("请输入培根克数：");
            int baconPizza = input.nextInt();
            System.out.println("请输入披萨大小：");
            int baconSize = input.nextInt();
            System.out.println("请输入披萨价格：");
            int baconPrice = input.nextInt();
            return new BaconPizza(name,baconPrice,baconSize,baconPizza).showInfo();

        }else if(name.equals("海鲜披萨")){
            System.out.println("请输入配料信息：");
            String seaFoodPizza = input.next();
            System.out.println("请输入披萨大小：");
            int seaFoodSize = input.nextInt();
            System.out.println("请输入披萨价格：");
            int seaFoodPrice = input.nextInt();
            new SeaFoodPizza(name,seaFoodPrice,seaFoodSize,seaFoodPizza).showInfo();
        }
        return null;
    }
}
