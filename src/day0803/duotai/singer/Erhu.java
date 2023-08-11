package day0803.duotai.singer;

public class Erhu extends Instrument{
    public Erhu(String name) {
        super(name);
    }

    public Erhu() {
    }

    @Override
    public void makeSound() {
        System.out.println("弹奏二胡");
    }
}
