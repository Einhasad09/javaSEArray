package homework0804.pizza.pizza011;

public class BaconPizza extends Pizza{
    double baconKilogream;

    public BaconPizza(String name, double price, double size, double baconKilogream) {
        super(name, price, size);
        this.baconKilogream = baconKilogream;
    }

    @Override
    public Pizza showInfo() {
        super.showInfo();
        System.out.println("培根克数："+baconKilogream);
        return null;
    }
}
