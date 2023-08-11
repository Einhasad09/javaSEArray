package homework0804.pizza.people01;

public class Actor extends People implements IMovie,IDrama,ISing{

    public Actor(String name) {
        super(name);
    }

    @Override
    public void showInfo() {
        System.out.println("大家好，我是"+getName());
    }

    @Override
    public void drama() {
        System.out.println("我能演电视剧");
    }

    @Override
    public void movie() {
        System.out.println("我能演电影");
    }

    @Override
    public void sing() {
        System.out.println("我能唱歌");
    }

}