package day0803.duotai.super02;

public class InstrumentBag extends Bag{
    public InstrumentBag(String color, String texture) {
        super(color, texture);
    }

    public InstrumentBag() {
    }

    @Override
    public void showInfo() {
        System.out.println("乐器包已生产完成");
        super.showInfo();
    }
    public void info(){
        System.out.println("我是吉他乐器包");
    }
}
