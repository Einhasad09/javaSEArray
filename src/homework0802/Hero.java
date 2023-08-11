package homework0802;

public class Hero {
    /**
     * 1、请用面向对象的思想设计英雄类和技能类。
     * 2、设置属性的私有访问权限，通过公有的get，set方法实现对属性的访问
     * 3、学习新技能的方法，需要判断新技能等级是否大于已经掌握技能等级，如果不满足条件则放弃学习
     * 4、攻击方法描述攻击状态。内容包括英雄名字，生命值、攻击力。其中攻击力=个人攻击力+技能攻击力
     * 5、防御方法通过输入参数接收攻击力。需要判断，如果攻击力小于防御力，伤害值=0；反之，伤害值=攻击力-防御力。 根据伤害值情况显示不同的防御信息，内容包括英雄名字， 防御力，防御后的生命值。其中防御力=个人防御力+技能防御力
     * 6、 编写测试类，构造技能对象和英雄对象，并调用相关方法（测试数据信息自定）
     *
     * 参考思路分析：
     * 技能类：
     * 属性包括：技能名称、攻击力、防御力、技能等级
     *
     * 英雄类：
     * 属性包括：英雄名字、生命值、攻击力、防御力、掌握的技能
     * 方法包括：学习新技能的方法、攻击的方法，防御的方法
     * */
    private String name;
    private int health;
    private int attackPower;
    private int defensePower;
    private Skill skill;

    public Hero(String name, int health, int attackPower, int defensePower, Skill skill) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    /**
     * 3、学习新技能的方法，需要判断新技能等级是否大于已经掌握技能等级，如果不满足条件则放弃学习
     * */
    public void learnNewSkill(Skill newSkill) {
        if(newSkill.getLevel() > this.skill.getLevel()) {
            this.skill = newSkill;
            System.out.println("已学习新技能: " + newSkill.getName());
        } else {
            System.out.println(newSkill.getName()+" 等级过低，不需要学习");
        }
    }
    /**
     * 4、攻击方法描述攻击状态。内容包括英雄名字，生命值、攻击力。其中攻击力=个人攻击力+技能攻击力
     * */
    public void attack(Hero hero) {
        int totalAttackPower = this.attackPower + this.skill.getAttackPower();
        System.out.println("英雄"+getName()+"展开攻击");
        System.out.println("当前生命值是："+getHealth());
        System.out.println("攻击力是："+getAttackPower());

    }

    /**
     * 5、防御方法通过输入参数接收攻击力。需要判断，如果攻击力小于防御力，伤害值=0；反之，伤害值=攻击力-防御力。
     * */
    public void defend(int incomingAttackPower) {
        int totalDefensePower = this.defensePower + this.skill.getDefensePower();

        int damageValue = incomingAttackPower > totalDefensePower ? incomingAttackPower - totalDefensePower : 0;
        this.health -= damageValue;
        if(damageValue==0){
            System.out.println("防御成功");
        }else{
            System.out.println("防御失败");
            System.out.println("英雄"+getName()+"以"+getDefensePower()+"未能抵御进攻！");
            System.out.println("当前生命值为："+damageValue);
        }
    }
}
