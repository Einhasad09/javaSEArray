package homework0804.pizza.pizza;

public class SeaFoodPizza extends Pizza{
    String ingredient;//配料

    public SeaFoodPizza(String name, int price, int size, String ingredient) {
        super(name, price, size);
        this.ingredient = ingredient;
    }
    public SeaFoodPizza(){}

    @Override
    public Pizza showInfo() {
        super.showInfo();
        System.out.println("配料:"+ingredient);
        return null;
    }
}
