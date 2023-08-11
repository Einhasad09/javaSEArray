package homework0804.pizza.drink;

public class Drink {
    /**
     * 编写程序实现饮料购买：
     * 编写程序，接收用户输入的信息，选择购买的饮料。
     * 可供选择的饮料有：咖啡、矿泉水和可乐。
     * 其中，购买咖啡时可以选择：加糖、加奶还是什么都不加。
     * 购买可乐时可以选择：买可口可乐还是百事可乐。
     * */
    String name;
    double ingredient;//容量

    public Drink(String name, double ingredient) {
        this.name = name;
        this.ingredient = ingredient;
    }

    public Drink(String name) {
        this.name = name;
    }

    public Drink() {
    }

    public Drink showInfo(){
        return null;
    }
}
