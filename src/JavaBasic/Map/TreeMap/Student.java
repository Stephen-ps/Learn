package JavaBasic.Map.TreeMap;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class Student {
    private String name;
    private int age;
    private double height;

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Student() {
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

class MyComparatorAge implements Comparator<Student> {
    @Override
    public int compare(@NotNull Student o1, @NotNull Student o2) {
        return o1.getAge() - o2.getAge();
    }
}

class MyComparatorHeight implements Comparator<Student> {
    @Override
    public int compare(@NotNull Student o1, @NotNull Student o2) {
        return Double.compare((o1.getHeight()), (o2.getHeight()));
    }
}

class MyComparatorName implements Comparator<Student> {
    @Override
    public int compare(@NotNull Student o1, @NotNull Student o2) {
        return CharSequence.compare((o1.getName()), (o2.getName()));
    }
}

