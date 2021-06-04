package JavaBasic.Enum.EnumInterfaceUse;

/**
 * @author Stephen
 * @date 2021-05-12 07:07
 **/
public class SeasonMain {
    public static void main(String[] args) {
        //测试每一种枚举属性是否有不一样的输出结果
        Season summer = Season.SUMMER;
        summer.show();

        Season winter = Season.WINTER;
        winter.show();

        Season spring = Season.SPRING;
        spring.show();

        Season autumn = Season.AUTUMN;
        autumn.show();
    }
}
