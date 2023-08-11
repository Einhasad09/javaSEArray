package day0803.duotai.super02;

public class Bag {
    String color;
    String texture;

    public Bag(String color, String texture) {
        this.color = color;
        this.texture = texture;
    }

    public Bag() {
    }

    public void showInfo(){
        System.out.println("颜色是"+color+"材质是"+texture);
    }
}
