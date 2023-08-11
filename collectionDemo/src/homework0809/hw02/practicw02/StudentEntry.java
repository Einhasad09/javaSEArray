package homework0809.hw02.practicw02;

public class StudentEntry {
    private int key;
    private  Student student;

    @Override
    public String toString() {
        return "StudentEntry{" +
                "key=" + key +
                ", student=" + student +
                '}';
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Student getStudent(Student value) {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentEntry() {
    }

    public StudentEntry(int key, Student student) {
        this.key = key;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
}
