package homework0803.doc;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Soldier soldier = new Soldier("刘天明",62,"男","军区司令员","北京军区","43");
        Doctor doctor = new Doctor("刘新",23,"男","主任医师","内科");

        p.work();
        System.out.println("____________________");
        soldier.work();
        System.out.println("____________________");
        doctor.work();
    }
}
