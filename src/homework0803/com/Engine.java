package homework0803.com;

public class Engine {
    private int displacement;//定义排量
    private int numberCylinders;//定义汽缸数
    private String type;

    public Engine() {
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getNumberCylinders() {
        return numberCylinders;
    }

    public void setNumberCylinders(int numberCylinders) {
        this.numberCylinders = numberCylinders;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine(int displacement, int numberCylinders, String type) {
        this.displacement = displacement;
        this.numberCylinders = numberCylinders;
        this.type = type;
    }
    public void work(){
        System.out.println("型号："+getType());
        System.out.println("排量："+getDisplacement());
        System.out.println("汽缸数："+getNumberCylinders());
    }
}
