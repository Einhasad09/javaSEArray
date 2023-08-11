package homework0804.pizza.drink;

public class Cola extends Drink{
    private String brand;  // 可乐的品牌

    public Cola(String name,String brand) {
        super(name);
        this.brand = brand;
    }

    public Cola(String name, double ingredient, String brand) {
        super(name, ingredient);
        this.brand = brand;
    }

    public Cola() {
    }

    @Override
    public Drink showInfo() {
        System.out.println("名称："+brand);
        System.out.println("容量"+ingredient);
        return null;
    }
}
