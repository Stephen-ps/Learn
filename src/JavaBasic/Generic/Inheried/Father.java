package JavaBasic.Generic.Inheried;

import org.jetbrains.annotations.Contract;

import java.util.Objects;

/**
 * @author Stephen
 * @date 2021-05-13 00:17
 **/
public class Father<A,B> {
    /**
     * 定义一个不能改变的泛型数据
     */
    public final A first;
    public final B second;

    /**
     * 构造器
     * @param first 第一个数据
     * @param second 第二个数据
     */



    @Contract(pure = true)
    public Father(A first, B second){
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Father{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    @Contract(value = "null -> false", pure = true)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Father<?, ?> father = (Father<?, ?>) o;
        return Objects.equals(first, father.first) && Objects.equals(second, father.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
