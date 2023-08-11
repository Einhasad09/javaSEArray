package test;

public class Test {
    public static void main(String[ ] args) {
       Person person = new Person();
       Sporter sporter = new Sporter("刘小翔",23,"男","200米短跑","22秒30");
       Actor actor = new Actor("章依",27,"女","寄往天国的家书","北京电影学院");
       person.showInfo();
       System.out.println("__________________________________________");
       sporter.showInfo();
       System.out.println("__________________________________________");
       actor.showInfo();
    }
}