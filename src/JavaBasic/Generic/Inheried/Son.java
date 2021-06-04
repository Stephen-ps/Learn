package JavaBasic.Generic.Inheried;

/**
 * @author Stephen
 * @date 2021-05-13 00:24
 **/
public class Son<A, B, C> extends Father<A,B> {
    /**
     * 新添加的元组
     */
    public final C third;

    /**
     * 新添加的构造器
     * @param first 第一个数据
     * @param second 第二个数据
     * @param third 第三个数据
     */

    public Son( A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "Son{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}
