package test;

public class Animal {
    String color;
    String name;

    public static void eat(){
        System.out.println("eat");
    }
    public  void run(){
        eat();
    }
    public static void swim(){
        Animal.eat();
    }
    private void show(){}
}
