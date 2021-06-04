package JavaBasic.IOStream.Serializable;

import org.jetbrains.annotations.Contract;

import java.io.Serial;
import java.io.Serializable;

/**
 * 实现Serializable只是一个标识接口，必须声明这个接口，否则无法进行序列化
 * @author Stephen
 * @date 2021-05-13 03:37
 **/
public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = -2201140435614546116L;
    private String name;
    private int age;

    @Contract(pure = true)
    @SuppressWarnings("unused")
    public Person() {
    }

    @Contract(pure = true)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SuppressWarnings("unused")
    public int getAge() {
        return age;
    }

    @SuppressWarnings("unused")
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
