import com.age11.AgeException;
import com.age11.Person;

public class Student extends Person {
    private int age;

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws ArithmeticException, NullPointerException, AgeException {
        if(age>=20){
            this.age = age;
        }else{
            this.age=20;
            throw new AgeException("年龄必须满20岁");
        }

    }

    @Override
    public void show() throws AgeException {

    }
}
