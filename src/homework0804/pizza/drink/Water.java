package homework0804.pizza.drink;

public class Water extends Drink{
    public Water(String name, double ingredient) {
        super(name, ingredient);
    }

    public Water() {
    }

    @Override
    public Drink showInfo() {
        System.out.println("成功购买矿泉水！");
        return null;
    }
}
