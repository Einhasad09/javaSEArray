package homework0803.bus;

public class Sdean extends Car{

    public Sdean(String plateNum, String carType, String carColor, double dayRentNum) {
        super(plateNum, carType, carColor, dayRentNum);
    }

    public Sdean() {
    }
    /**
     * 小轿车类：
     * 属性包括：车牌号、车型、颜色、日租金
     * 方法包括：租赁（租金计算：10天内按日租金计算，10天以上每天加收10%）
     * */

    public void lease(String leaseName,double leaseDay){
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
            return (getDayRentNum()*10)+((leaseDay-10)*0.1);
        }
    }

}
