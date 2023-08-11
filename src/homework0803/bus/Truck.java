package homework0803.bus;

public class Truck extends Car{
    /**
     * 卡车类：
     * 属性包括：车牌号、车型、颜色、日租金、载重量
     * 方法包括：租赁（租金计算：10天内按日租金计算，10天以上每天每吨加收10%）
     * */

    private double weight;

    public Truck(String plateNum, String carType, String carColor, double dayRentNum, double weight) {
        super(plateNum, carType, carColor, dayRentNum);
        this.weight = weight;
    }

    public Truck() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void lease(String leaseName, double leaseDay){
        System.out.println("租赁信息");
        System.out.println("车牌号："+getPlateNum());
        System.out.println("车型："+getCarType());
        System.out.println("颜色:"+getCarColor());
        System.out.println("租车人"+leaseName);
        System.out.println("应付金额"+calculate(leaseDay));
    }
    public double calculate(double leaseDay){
        if(leaseDay<=10){
            return leaseDay*getDayRentNum();
        }else{
            return (getDayRentNum()*10)+((leaseDay-10)*0.1)*getWeight();
        }
    }
}
