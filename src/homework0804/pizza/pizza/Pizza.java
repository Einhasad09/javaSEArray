package homework0804.pizza.pizza;

public class Pizza {
    String name;
    int price;
    int size;

    public Pizza(String name, int price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public Pizza() {
    }

    public Pizza showInfo(){
        System.out.println("名称："+name);
        System.out.println("价格："+price+"元");
        System.out.println("大小："+size+"寸");
        return null;
    }

}
