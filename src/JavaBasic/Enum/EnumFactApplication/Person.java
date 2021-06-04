package JavaBasic.Enum.EnumFactApplication;

/**
 * @author Stephen
 * @date 2021-05-12 07:15
 **/
public class Person {
    /**
     * 属性
     */
    private String name;
    private int age;
    private Gender sex;

    /**
     * 空构造器，为了创建对象使用
     */
    public Person() {
    }

    /**
     * 有参构造器
     *
     * @param name 姓名
     * @param age  年龄
     * @param sex  性别
     */
    @SuppressWarnings("unused")
    public Person(String name, int age, Gender sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public void setAge(int age) {
        this.age = age;
    }

    @SuppressWarnings("unused")
    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
