package homework0804.pizza.animal01;

public class Gua extends Animal implements ISwim{

    public Gua(String name, String color, String type) {
        super(name, color, type);
    }

    @Override
    public void eat() {
        System.out.println("青蛙是"+this.getType()+"，爱吃昆虫");
    }

    @Override
    public void bark() {
        System.out.println("那只"+this.getColor()+"的，名叫"+this.getColor()+"的青蛙正在呱呱地叫");
    }

    @Override
    public void swim() {
        System.out.println("虽然不是鱼，但青蛙也是泳坛高手");
    }

    @Override
    public void aMethod() {

    }

    @Override
    public void aMethod1() {

    }
}
