package day0803.duotai;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public Dog() {
    }

    @Override
    public void cry(){
        System.out.println("dog cry() 小狗汪汪叫");
    }
    @Override
    public void eat(){
        System.out.println(name+"吃骨头");
    }
}
