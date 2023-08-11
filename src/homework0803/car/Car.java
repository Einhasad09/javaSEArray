package homework0803.car;

public class Car {
    /**
     * 1、请使用面向对象的思想，设计自定义类，描述出租车和家用轿车
     * 2、分析出租车和家用轿车的公共成员，提取出父类---汽车类
     * 3、利用继承机制，实现出租车类和家用轿车类
     * 4、利用封装机制，设置属性的私有访问权限，通过公有的get，set方法实现对属性的访问 5、 编写测试类，分别测试汽车类，出租车类和家用轿车类的对象及相关方法（测试数据信息自定）
     * 6、 定义名为car的包存放汽车类，出租车类、家用轿车类和测试类
     *
     * 参考分析思路:
     * 出租车类：
     * 属性包括：车型，车牌，所属出租公司
     * 方法包括：启动、停止
     *
     * 家用轿车类：
     * 属性包括：车型，车牌，车主姓名
     * 方法包括：启动、停止
     * */
    private String carType;//车型
    private String carPlateNumber;//车牌

    public Car(String carType, String carPlateNumber) {
        this.carType = carType;
        this.carPlateNumber = carPlateNumber;
    }

    public Car() {
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarPlateNumber() {
        return carPlateNumber;
    }

    public void setCarPlateNumber(String carPlateNumber) {
        this.carPlateNumber = carPlateNumber;
    }

    public void carStart(){
        System.out.println("我是车，我启动");
    }
    public void carStop(){
        System.out.println("我是车，我停止");
    }
}
