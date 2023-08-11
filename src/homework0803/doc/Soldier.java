package homework0803.doc;

public class Soldier extends Person{
    /**
     ** 医生类：
     ** 属性包括：姓名，年龄，性别，所在科室，职务
     ** 方法包括：工作
     **
     ** 军人类： 属性包括：姓名，年龄，性别，所属部队，职务，军龄
     ** 方法包括：工作
     * */

    private String assignedForces;//所属部队
    private String lengthOfMilitaryService;//军龄

    public Soldier(String name, int age, String sex, String duty, String assignedForces, String lengthOfMilitaryService) {
        super(name, age, sex, duty);
        this.assignedForces = assignedForces;
        this.lengthOfMilitaryService = lengthOfMilitaryService;
    }

    public Soldier() {}

    public String getAssignedForces() {
        return assignedForces;
    }

    public void setAssignedForces(String assignedForces) {
        this.assignedForces = assignedForces;
    }

    public String getLengthOfMilitaryService() {
        return lengthOfMilitaryService;
    }

    public void setLengthOfMilitaryService(String lengthOfMilitaryService) {
        this.lengthOfMilitaryService = lengthOfMilitaryService;
    }

    public void work(){
        System.out.println("Name:"+getName());
        System.out.println("Profession:军人");
        System.out.println("Age:"+getAge());
        System.out.println("AssignedForces:"+getAssignedForces());
        System.out.println("Duty:"+getDuty());
        System.out.println("LengthOfMilitaryService："+getLengthOfMilitaryService());
    }
}
