package homework0804.pizza.pizza011;

public class FrueatPizza extends Pizza{
    String fruit;

    public FrueatPizza(String name, double price, double size, String fruit) {
        super(name, price, size);
        this.fruit = fruit;
    }

    @Override
    public Pizza showInfo() {
        super.showInfo();
        System.out.println("配料水果："+fruit);
        return null;
    }
}
