package homework0803.com;

public class Test {
    public static void main(String[] args) {
        AutoMobile automobile=new AutoMobile("xxxx","京D588","桑塔纳2000");
        automobile.operation();
        Engine engine=new Engine(2350,4,"三菱4G63");
        engine.work();
    }

}
