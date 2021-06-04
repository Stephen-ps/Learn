package JavaBasic.Set.HashSet;

import java.util.Objects;

public class Method {

    private String name = "";
    private int age = 0;

    @Override
    public String toString() {
        return "Method{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Method that = (Method) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    /**重写hashcode 方法保证没有两个完全一样的元素被存储*/
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Method() {
    }

    public Method(String name, int age) {
        this.name = name;
        this.age = age;
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
}
