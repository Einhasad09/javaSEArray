package homework0803.car;

public class Taxi extends Car{
    /**
     * 参考分析思路:
     * 出租车类：
     * 属性包括：车型，车牌，所属出租公司
     * 方法包括：启动、停止
     * */
    String taxiCompany;

    public Taxi(String carType, String carPlateNumber, String taxiCompany) {
        super(carType, carPlateNumber);
        this.taxiCompany = taxiCompany;
    }

    public Taxi(String taxiCompany) {
        this.taxiCompany = taxiCompany;
    }

    public String getTaxiCompany() {
        return taxiCompany;
    }

    public void setTaxiCompany(String taxiCompany) {
        this.taxiCompany = taxiCompany;
    }

    public void carStart(){
        System.out.println("乘客您好");
        System.out.println("我是"+getTaxiCompany()+"的，我的车牌是" + getCarPlateNumber() +",您要去哪里？");
    }
    public void carStop(){
        System.out.println("目的地已经到了，请您付费下车，欢迎再次乘坐");
    }

}
