package JavaBasic.Enum.CommonUse;

/**
 * @author Stephen
 * @date 2021-05-12 06:57
 **/
public class SeasonMain {
    public static void main(String[] args) {
        //获取枚举内容
        Season autumn = Season.AUTUMN;
        System.out.println(autumn);

        System.out.println("======================");

        //values:返回枚举类对象的数组
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
        }

        System.out.println("======================");

        //valueOf 括号内的字符串必须传正确，否则会报错中断程序
        Season summer = Season.valueOf("SUMMER");
        System.out.println(summer);
    }
}
