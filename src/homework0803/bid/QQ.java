package homework0803.bid;

public class QQ extends Bird{
    public QQ() {
    }

    public QQ(String name, String color) {
        super(name, color);
    }

    /**
     * * 企鹅类：
     * * 属性包括：名字，颜色
     * * 方法包括：飞，吃，游泳
     * */

    public void fly(){
        System.out.println("我是"+getName()+"，我太胖了，所以不会飞");
    }
    public void eat(){
        System.out.println("我喜欢吃<・)))><<");
    }
    public void swim(){
        System.out.println("虽然我很胖，但我比<・)))><<游得快");
    }
}
