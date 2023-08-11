package day0803.duotai.singer;

public class Instrument {
    String name;

    public Instrument(String name) {
        this.name = name;
    }

    public Instrument() {
    }

    public void makeSound(){
        System.out.println("弹奏乐器");
    }

}
