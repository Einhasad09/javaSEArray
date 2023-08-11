package day0803;

public class Student extends Person{
    private String address;

    public Student() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void show(){
        System.out.println(address+";");
    }
}

