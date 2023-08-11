package homework0804.pizza.pizza;

public class BaconPizza extends Pizza{
    int baconKilogram;

    public BaconPizza(String name, int price, int size, int baconKilogram) {
        super(name, price, size);
        this.baconKilogram = baconKilogram;
    }

    public BaconPizza(){}

    @Override
    public Pizza showInfo() {
        super.showInfo();
        System.out.println("培根克数:"+baconKilogram);
        return null;
    }

}
