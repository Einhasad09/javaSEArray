package homework0802;

public class Car {
    /**
     * 1、请用面向对象的思想设计卡车类。
     * 2、设置属性的私有访问权限，通过公有的get，set方法实现对属 性的访问
     * 3、租赁方法通过输入参数，接收租车人姓名和租赁时间，描述租 赁状态，要求判断租赁时间的有效性
     * 4、设计构造函数实现属性赋值
     * 5、 编写测试类，测试卡车类的对象及相关方法（测试数据信息自定）
     *
     * 参考分析思路：
     * 卡车类：
     * 属性包括：车牌号、车型、颜色、日租金、载重量
     * 方法包括：租赁
     * */
    private String carPlateNum;//车牌号
    private String carModel;//车型
    private String carColor;//颜色
    private double carRent;//租金
    private double carLoad;//载重

    public Car(String carPlateNum, String carModel, String carColor, double carRent, double carLoad) {
        setCarPlateNum(carPlateNum);
        setCarModel(carModel);
        setCarColor(carColor);
        setCarRent(carRent);
        setCarLoad(carLoad);
    }

    public String getCarPlateNum() {
        return carPlateNum;
    }

    public void setCarPlateNum(String carPlateNum) {
        this.carPlateNum = carPlateNum;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public double getCarRent() {
        return carRent;
    }

    public void setCarRent(double carRent) {
        this.carRent = carRent;
    }

    public double getCarLoad() {
        return carLoad;
    }

    public void setCarLoad(double carLoad) {
        this.carLoad = carLoad;
    }

    public void lease(String leaseName, int leaseDayNum){
        System.out.println("请输入租车人姓名："+leaseName);
        System.out.println("请输入租赁天数："+leaseDayNum);
        System.out.println("租赁信息");
        System.out.println("车牌号:"+getCarPlateNum());
        System.out.println("车型："+getCarModel());
        System.out.println("颜色："+getCarColor());
        System.out.println("载重量："+getCarLoad());
        System.out.println("租车人："+leaseName);
        if(leaseDayNum>1){
            System.out.println("应付金额："+(getCarRent()*leaseDayNum));
        }

    }
}
