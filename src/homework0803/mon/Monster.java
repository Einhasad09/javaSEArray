package homework0803.mon;

public class Monster {
    /**
     * 1、请用面向对象的思想，设计游戏中的蛇怪和蜈蚣精。
     * 2、分析蛇怪和蜈蚣精的公共成员，提取出父类---怪物类
     * 3、利用继承机制，实现蛇怪类和蜈蚣精类
     * 4、利用封装机制，设置属性的私有访问权限，通过公有的get，set方法实现对属性的访问 5、 攻击方法，描述攻击状态。内容包括怪物名字，生命值，攻击力
     * 6、编写测试类，分别测试蛇怪和蜈蚣精的对象及相关方法（测试数据信息自定）
     * 7、 定义名为mon的包存放怪物类，蛇怪类、蜈蚣精类和测试类
     *
     * 参数分析思路：
     * 蛇怪类：
     * 属性包括：怪物名字、生命值、攻击力
     * 方法包括：攻击、移动（曲线移动）、补血（当生命值<10时，可以补加20生命值）
     *
     * 蜈蚣精类：
     * 属性包括：怪物名字、生命值、攻击力
     * 方法包括：攻击、移动（飞行移动）
     * */
    private String monsterName;
    private int hpNum;
    private int atkNum;

    public Monster() {
    }

    public Monster(String monsterName, int hpNum, int atkNum) {
        this.monsterName = monsterName;
        this.hpNum = hpNum;
        this.atkNum = atkNum;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public int getHpNum() {
        return hpNum;
    }

    public void setHpNum(int hpNum) {
        this.hpNum = hpNum;
    }

    public int getAtkNum() {
        return atkNum;
    }

    public void setAtkNum(int atkNum) {
        this.atkNum = atkNum;
    }

    /**
     * 共同行为
     * */
    public void attack(){
        System.out.println(monsterName+"展开攻击");
        System.out.println("当前生命值是："+hpNum);
        System.out.println("攻击力是："+atkNum);
    }

    public void move(){
    }
}
