package homework0803.doc;

public class Doctor extends Person{
    /**
     ** 医生类：
     ** 属性包括：姓名，年龄，性别，所在科室，职务
     ** 方法包括：工作
     **
     ** 军人类： 属性包括：姓名，年龄，性别，所属部队，职务，军龄
     ** 方法包括：工作
     * */
    private String department;//所在科室

    public Doctor(String name, int age, String sex, String duty, String department) {
        super(name, age, sex, duty);
        this.department = department;
    }

    public Doctor() {}

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void work(){
        System.out.println("Name:"+getName());
        System.out.println("Profession:医生");
        System.out.println("Age:"+getAge());
        System.out.println("Department:"+getDepartment());
        System.out.println("Duty:"+getDuty());
    }
}
