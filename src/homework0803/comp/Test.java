package homework0803.comp;

public class Test {
    public static void main(String[] args) {
        Computer computer=new Computer("Intel奔腾双核E5300","xxxx","xxxx","戴尔530MT");
        Cpu cpu=new Cpu(2600,"双核心","xxxx");

        computer.operation();
        cpu.work();
    }

}
