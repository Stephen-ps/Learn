package JavaBasic.Comparable;

import org.jetbrains.annotations.NotNull;


/**
 * <P>重写了compareTo方法，主要用来排序。</p>
 */
public class orderCompareTo implements Comparable<orderCompareTo>{

    private String name = "";
    private int age;

    /**
     * <P>this - o 就是升序排序。</p>
     * <P>0 - this 就是降序排序。</p>
     */
    @Override
    public int compareTo(@NotNull orderCompareTo o) {
        return o.age - this.age;
    }

    public orderCompareTo() {
    }

    @Override
    public String toString() {
        return "orderCompareTo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public orderCompareTo(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
