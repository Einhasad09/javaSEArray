package homework0803.bid;

public class Sparrow extends Bird{
    public Sparrow() {
    }

    public Sparrow(String name, String color) {
        super(name, color);
    }

    /**
     ** 麻雀类：
     ** 属性包括：名字，颜色
     ** 方法包括：飞，吃
     * */

    public void fly(){
        System.out.println("我是"+getName()+"，我动作敏捷，飞得比火箭快");
    }
    public void eat(){
        System.out.println("我不仅吃种子，也吃害虫！");
    }
}
