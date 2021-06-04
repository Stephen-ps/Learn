package JavaBasic.Enum.JDKBefore1point5;

/**
 * @author Stephen
 * @date 2021-05-12 06:26
 **/
public class EnumLearnMain {
    public static void main(String[] args) {
        //获取枚举内容
        Season summer = Season.SUMMER;
        System.out.println(summer);

        //获取季节名称
        String seasonName = summer.getSeasonName();
        System.out.println(seasonName);

        //获取父类名称
        System.out.println(Season.class.getSuperclass().getName());//java.lang.Object
    }
}
