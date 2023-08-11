package homework0804.pizza.pizza;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请选择想要制作的披萨：1培根披萨、2海鲜披萨");
        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        switch (select){
            case 1:
                Pizza pizza = PizzaFactory.makePizza("培根披萨");
                break;
            case 2:
                Pizza piza = PizzaFactory.makePizza("海鲜披萨");
                break;
        }
    }
}
