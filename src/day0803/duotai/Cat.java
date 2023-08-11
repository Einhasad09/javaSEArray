package day0803.duotai;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public Cat() {
    }

    @Override
    public void eat(){
        System.out.println(name+"吃鱼");
    }
    @Override
    public void cry(){
        System.out.println("cat cry() 小猫喵喵叫");
    }

    public void run(){
        System.out.println(name+"正在奔跑");
    }
}
