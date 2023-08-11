package homework0803.car;

public class PrivateCar extends Car{
    /**
     * 家用轿车类：
     * 属性包括：车型，车牌，车主姓名
     * 方法包括：启动、停止
     * */
    String carOwner;

    public PrivateCar(String carType, String carPlateNumber, String carOwner) {
        super(carType, carPlateNumber);
        this.carOwner = carOwner;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public PrivateCar(String carOwner) {
        this.carOwner = carOwner;
    }

    public void carStart(){
        System.out.println("我是"+getCarOwner()+"我的汽车我做主");
    }
    public void carStop(){
        System.out.println("目的地到了，我们去玩吧");
    }
}
