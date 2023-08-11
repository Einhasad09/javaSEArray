package homework0803.comp;

public class Computer {
    private String cpu;
    private String memoryCapacity;//定义内存容量
    private String HardDriveCapacity;//定义硬盘容量
    private String type;

    public Computer(String cpu, String memoryCapacity, String hardDriveCapacity, String type) {
        this.cpu = cpu;
        this.memoryCapacity = memoryCapacity;
        HardDriveCapacity = hardDriveCapacity;
        this.type = type;

    }

    public Computer() {
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(String memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public String getHardDriveCapacity() {
        return HardDriveCapacity;
    }

    public void setHardDriveCapacity(String hardDriveCapacity) {
        HardDriveCapacity = hardDriveCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void operation(){
        System.out.println(getType()+"开机运行");
        System.out.println(getCpu()+"开始工作。。。。");
    }
}
