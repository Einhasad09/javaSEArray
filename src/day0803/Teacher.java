package day0803;

public class Teacher extends Person{
    private String teachingAge;

    public Teacher() {
    }

    public String getTeachingAge() {
        return teachingAge;
    }

    public void setTeachingAge(String teachingAge) {
        this.teachingAge = teachingAge;
    }

    public void work(){
        info();
        System.out.println(teachingAge+";");
    }
}
