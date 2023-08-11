package homework0802;

public class Skill {
    /**
     * 技能类：
     * 属性包括：技能名称、攻击力、防御力、技能等级
     * */
    private String name;
    private int attackPower;
    private int defensePower;
    private int level;

    public Skill(String name, int attackPower, int defensePower, int level) {
        this.name = name;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
