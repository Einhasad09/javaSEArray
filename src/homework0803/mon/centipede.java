package homework0803.mon;

public class centipede extends Monster{
    public void move(){
        System.out.println("我是蜈蚣精，御风飞行！");
    }

    public centipede(String monsterName,int hpNum,int atkNum){
        super(monsterName,hpNum,atkNum);
    }
}
