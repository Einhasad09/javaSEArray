package homework0804.pizza.pizza011;

import java.util.Scanner;

public class MakePizza {

    public static Pizza makeMakePizza(String name){
        Scanner input = new Scanner(System.in);
        if(name.equals("培根披萨")){
            System.out.println("请输入培根的克数：");
            double baconKg = input.nextDouble();
            System.out.println("请输入披萨大小：");
            double baconSize = input.nextDouble();
            System.out.println("请输入披萨价格：");
            double baconPrice = input.nextDouble();
            return new BaconPizza(name,baconPrice,baconSize,baconKg).showInfo();
        }else if(name.equals("水果披萨")){
            System.out.println("请输入你想要加入的水果：");
            String fruitKg = input.next();
            System.out.println("请输入披萨大小：");
            double fruitSize = input.nextDouble();
            System.out.println("请输入披萨价格：");
            double fruitPrice = input.nextDouble();
            return new FrueatPizza(name,fruitPrice,fruitSize,fruitKg).showInfo();
        }
        return null;
    }
}
