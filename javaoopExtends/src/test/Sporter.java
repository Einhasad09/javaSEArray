package test;

public class Sporter extends Person{
    private String sportItem;//运动项目
    private String maxHistory;//历史最好成绩

    public Sporter(){}
    public Sporter(String name, int age, String gender, String sportItem, String maxHistory) {
        super(name, age, gender);
        this.sportItem = sportItem;
        this.maxHistory = maxHistory;
    }

    public String getSportItem() {
        return sportItem;
    }

    public void setSportItem(String sportItem) {
        this.sportItem = sportItem;
    }

    public String getMaxHistory() {
        return maxHistory;
    }

    public void setMaxHistory(String maxHistory) {
        this.maxHistory = maxHistory;
    }

    @Override
    public void showInfo() {
        System.out.println("大家好！我是"+getName());
        System.out.println("今年"+getAge());
        System.out.println("我最擅长的运动项目是："+getSportItem());
        System.out.println("历史最好成绩是："+getMaxHistory());
    }
}
