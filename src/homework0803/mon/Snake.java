package homework0803.mon;

public class Snake extends Monster {

    public Snake(String monsterName,int hpNum,int atkNum){
        super(monsterName,hpNum,atkNum);
    }
    public void move() {
        System.out.println("我是蛇怪，我走S型路线");
    }
    public void recoverHp() {
        if(getHpNum() < 10) {
            setHpNum(getHpNum()+20);
            System.out.println("实施大蛇补血术.....,当前生命值是" + getHpNum());
        }
    }
}
