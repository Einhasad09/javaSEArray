package homework0803.emp;

public class Department {
    private String departmentNumber;//部门编号
    private String departmentName;

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(String departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department(String departmentNumber, String departmentName) {
        this.departmentNumber = departmentNumber;
        this.departmentName = departmentName;
    }

    public Department() {
    }

}