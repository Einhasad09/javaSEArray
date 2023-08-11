package com.zoo;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Feeder feeder = new Feeder();
        feeder.feed(cat);
        Dog dog = new Dog();
        feeder.feed(dog);
    }
}
