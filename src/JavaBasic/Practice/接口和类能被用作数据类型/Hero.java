package JavaBasic.Practice.接口和类能被用作数据类型;

public class Hero {

    private String name;
    //这是一个接口的类型，接口可以被定义为一个数据类型
    private Skill skill;
    //这是一个类的类型，类可以被定义为一个数据类型
    private Weapon weapon;

    public Hero() {
    }

    public void attack(){
        System.out.println(name + "使用" + weapon.getCode() +  "攻击敌方");
        skill.use();
        System.out.println("释放完成");
    }

    public Hero(String name, Skill skill, Weapon weapon) {
        this.name = name;
        this.skill = skill;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

