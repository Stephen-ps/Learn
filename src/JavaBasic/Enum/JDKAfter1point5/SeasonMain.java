package JavaBasic.Enum.JDKAfter1point5;

/**
 * @author Stephen
 * @date 2021-05-12 06:41
 **/
public class SeasonMain {
    public static void main(String[] args) {
        //获取枚举内容
        Season spring = Season.SPRING;
        System.out.println(spring);

        //获取季节名称
        String seasonName = spring.getSeasonName();
        System.out.println(seasonName);

        //获取父类名称
        System.out.println(Season.class.getSuperclass().getName());//java.lang.Enum
    }
}
