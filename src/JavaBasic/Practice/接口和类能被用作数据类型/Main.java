package JavaBasic.Practice.接口和类能被用作数据类型;

public class Main {

    public static void main(String[] args) {
        //创建对象
        Hero hero = new Hero();
        //设置英雄姓名
        hero.setName("艾希");
        //创建武器代号对象
        Weapon weapon = new Weapon("霜之哀伤");
        //设置武器代号
        hero.setWeapon(weapon);
        //设置技能
        hero.setSkill(new SkillImpl());
        //调用攻击方法
        hero.attack();
    }
}