package day0803.duotai;

public class Animal {
    public Animal() {
    }

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("吃饭");
    }
    public void cry(){
        System.out.println("animal cry() 动物在叫");
    }
}
