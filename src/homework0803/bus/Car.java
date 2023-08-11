package homework0803.bus;

public class Car {
    /**
     * 1、请用面向对象的思想设计卡车类和小轿车类
     * 2、分析卡车和小轿车的公共成员，提取出父类---汽车类
     * 3、利用继承机制，实现卡车类和小轿车类
     * 4、利用封装机制，设置属性的私有访问权限，通过公有的get，set方法实现对属性的访问 5、 租赁的方法通过输入参数，接收租车人姓名和租赁时间，描述租赁状态。
     * 6、编写测试类，分别测试卡车类和小轿车类的对象及相关方法（测试数据信息自定）
     * 7、 定义名为bus的包存放汽车类，卡车类、小轿车类和测试类
     *
     * 参考分析思路：
     * 卡车类：
     * 属性包括：车牌号、车型、颜色、日租金、载重量
     * 方法包括：租赁（租金计算：10天内按日租金计算，10天以上每天每吨加收10%）
     *
     * 小轿车类：
     * 属性包括：车牌号、车型、颜色、日租金
     * 方法包括：租赁（租金计算：10天内按日租金计算，10天以上每天加收10%）
     * */

    private String plateNum;//车牌号
    private String carType;//车型
    private String carColor;
    private double dayRentNum;//日租金


    public Car(String plateNum, String carType, String carColor, double dayRentNum) {
        this.plateNum = plateNum;
        this.carType = carType;
        this.carColor = carColor;
        this.dayRentNum = dayRentNum;
    }

    public Car() {
    }

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public double getDayRentNum() {
        return dayRentNum;
    }

    public void setDayRentNum(double dayRentNum) {
        this.dayRentNum = dayRentNum;
    }

    public void lease(){
        System.out.println("租赁信息");
        System.out.println("车牌号："+getPlateNum());
        System.out.println("车型："+getCarType());
        System.out.println("颜色:"+getCarColor());
    }

}
