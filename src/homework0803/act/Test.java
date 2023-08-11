package homework0803.act;

public class Test {
    public static void main(String[] args) {
        /*第九题*/
        Person p = new Person();
        Athletes athletes = new Athletes("刘小翔",23,"男","200米短跑","22秒30");
        Actor actor = new Actor("章依",27,"女","北京电影学院","寄往天国的家书");
        p.introduce();
        System.out.println("_________________________");
        athletes.introduce();
        System.out.println("_________________________");
        actor.introduce();
    }
}
