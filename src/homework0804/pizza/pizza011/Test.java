package homework0804.pizza.pizza011;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请选择想要制作的pizza：1.培根 2.水果");
        int select = input.nextInt();
        switch (select){
            case 1:
                Pizza pizza = MakePizza.makeMakePizza("培根披萨");
                break;
            case 2:
                Pizza piza = MakePizza.makeMakePizza("水果披萨");
                break;
        }
    }
}
