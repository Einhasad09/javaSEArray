package day0804.interface01;

public class SecurityDoor extends Door implements  ISecurity{
    @Override
    public void open() {
        System.out.println("打开防盗门");
    }

    @Override
    public void close() {
        System.out.println("关闭防盗门");
    }

    @Override
    public void Security() {
        System.out.println("防盗门拥有了防盗功能");
    }

    @Override
    public void show() {

    }
}
