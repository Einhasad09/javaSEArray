package day0803.duotai;

public class Test {

    public static void main(String[] args){
        /**
         * 编译类型Animal羊  (真实)运行类型Dog狼
         * 披着羊皮的狼
         * */
        /*Animal animal = new Dog();
        //看运行类型，因为是DOG，所以执行的是Dog的cry()
        animal.cry();
        //运行类型Cat，所以执行Cat的cry()
        animal = new Cat();
        animal.cry();*/
        Master tom = new Master("汤米");
        Dog dog = new Dog("大黄狗");
        Bone bone = new Bone("大棒骨");
        tom.feed(dog,bone);
    }
}
