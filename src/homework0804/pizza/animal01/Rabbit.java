package homework0804.pizza.animal01;

public class Rabbit extends Animal{

    public Rabbit(String name, String color, String type) {
        super(name, color, type);
    }

    @Override
    public void eat() {
        System.out.println("那只"+this.getColor()+"的，名叫"+this.getName()+"的兔子正在叽叽地叫");
    }

    @Override
    public void bark() {
        System.out.println("兔子是"+this.getType()+"，爱吃胡萝卜");
    }
}
