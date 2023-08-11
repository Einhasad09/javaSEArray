package homework0804.pizza.animal01;

public class Test {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("兔子","黑色","哺乳类");
        Gua gua = new Gua("青蛙","绿色","非哺乳类");
        rabbit.bark();
        rabbit.eat();
        System.out.println("_____________________________");
        gua.bark();
        gua.eat();
        gua.swim();
    }
}
