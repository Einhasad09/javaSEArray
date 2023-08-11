package homework0803.com;

public class AutoMobile {
    private String engine;//发动机
    private String plateNumber;//车牌
    private String vehicleModel;//车型

    public AutoMobile() {
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public AutoMobile(String engine, String plateNumber, String vehicleModel) {
        this.engine = engine;
        this.plateNumber = plateNumber;
        this.vehicleModel = vehicleModel;
    }
    public void operation(){
        System.out.println("车牌为"+getPlateNumber()+"的"+getVehicleModel()+"启动。。。。。");
        System.out.println("发动机开始工作");
    }
}
