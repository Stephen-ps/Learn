package JavaBasic.Enum.JDKBefore1point5;

/**
 * 定义枚举类：季节
 * <p>这里使用的方法是限于JDK1.5以前</p>
 * @author Stephen
 * @date 2021-05-12 06:06
 **/
@SuppressWarnings("unused")
public class Season {
    /**
     * 定义属性
     */
    private final String seasonName;//季节名字
    private final String seasonDesc;//季节描述

    /**
     * 利用构造器对属性进行赋值操作
     * @param seasonName 传入季节名字
     * @param seasonDesc 传入季节描述
     */
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    /**
     * <p>提供枚举类的有限的，确定的对象；</p>
     * <p>这里的是属性并非方法</p>
     * <p>在这里定义了枚举的内容</p>
     */
    public static final Season SPRING = new Season("春天", "春暖花开");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season AUTUMN = new Season("秋天", "秋高气爽");
    public static final Season WINTER = new Season("冬天", "大雪纷飞");

    /**
     * 让外部类可以得到seasonName的值
     * @return seasonName
     */
    public String getSeasonName() {
        return seasonName;
    }

    /**
     * 让外部类可以得到seasonDesc的值
     * @return seasonDesc
     */
    public String getSeasonDesc() {
        return seasonDesc;
    }

    /**
     *
     * @return 按格式打印枚举
     */
    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
