package homework0804.pizza.pizza011;

public class Pizza {
    String name;
    double price;
    double size;

    public Pizza(String name, double price, double size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public Pizza showInfo(){
        System.out.println("名称："+name);
        System.out.println("价格："+price);
        System.out.println("大小："+size);
        return null;
    }

}
