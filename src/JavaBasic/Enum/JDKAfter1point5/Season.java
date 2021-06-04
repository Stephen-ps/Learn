package JavaBasic.Enum.JDKAfter1point5;

/**
 * 定义枚举类：季节
 * <p>这里使用的方法是限于JDK1.5以后</p>
 * 推荐使用此方法
 * @author Stephen
 * @date 2021-05-12 06:06
 **/
@SuppressWarnings("unused")
public enum Season {
    /**
     * <p>在这里定义了枚举的内容</p>
     */
    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "夏日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "大雪纷飞");

    /**
     * 属性
     */
    private final String seasonName;
    private final String seasonDesc;

    /**
     * 利用构造器对属性进行赋值操作
     *
     * @param seasonName 传入季节名字
     * @param seasonDesc 传入季节描述
     */
    Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    /**
     * 让外部类可以得到seasonName的值
     * @return seasonName
     */
    public String getSeasonName() {
        return seasonName;
    }

    /**
     * 让外部类可以得到seasonDesc的值
     *
     * @return seasonDesc
     */
    public String getSeasonDesc() {
        return seasonDesc;
    }

    /**
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
