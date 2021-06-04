package Example;

import java.io.Serial;

/**
 * A test class for reflection
 *
 * @author Stephen
 * @date 2021-05-17 14:59
 **/
@SuppressWarnings("unused")
@MyAnnotation("This is a test class for reflection")
public class Student extends Person implements MyInterface {
    @Serial
    private static final long serialVersionUID = -2965135582123742240L;
    public double score;
    protected double weight;
    double height;
    private int sno;

    /**
     * 构造器
     */
    public Student() {
    }

    public Student(int sno, double height, double weight) {
        this.sno = sno;
        this.height = height;
        this.weight = weight;
    }

    protected Student(double height, double weight, double score) {
        this.height = height;
        this.weight = weight;
        this.score = score;
    }

    Student(int sno, double weight) {
        this.sno = sno;
        this.weight = weight;
    }

    private Student(int sno, double height, double weight, double score) {
        this.sno = sno;
        this.height = height;
        this.weight = weight;
        this.score = score;
    }

    @MyAnnotation(value = "This is public Method")
    public String showInfo() {
        return "我是一个好学生";
    }

    public String showInfo(int a, int b) {
        return "重载方法";
    }

    protected int getSno() {
        return sno;
    }

    void happy() {
        System.out.println("学习使我快乐");
    }

    private void work() {
        System.out.println("我在工作");
    }

    @MyAnnotation("This is a override method")
    @Override
    public void method() {
        System.out.println("重写了method方法体");
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", height=" + height +
                ", weight=" + weight +
                ", score=" + score +
                '}';
    }
}