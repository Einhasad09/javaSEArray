package homework0804.pizza.drink;

public class Coffee extends Drink{
    private String addition; // 咖啡的添加物

    public Coffee(String name, String addition) {
        super(name);
        this.addition = addition;
    }

    public Coffee(String name, double ingredient, String addition) {
        super(name, ingredient);
        this.addition = addition;
    }

    @Override
    public Drink showInfo() {
        System.out.println("名称："+name);
        System.out.println("添加配料："+addition);
        System.out.println("容量"+ingredient);
        return null;
    }


}
