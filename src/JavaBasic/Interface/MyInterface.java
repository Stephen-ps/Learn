package JavaBasic.Interface;

/**
 * @author Steven
 * @date 2021/5/5
 */
public interface MyInterface {

    /**
     * 普通抽象方法
     */
    void methodAbs();

    /**
     * 默认方法解决接口升级问题
     */
    default void method() {
        System.out.println("这是一个默认的抽象方法");
    }

    /**
     * 静态接口方法实现
     */
    static void methodStatic() {
        System.out.println("这是一个静态的接口方法");
    }

    /**
     * 调用私有方法（解决代码重复问题）
     */
    static void methodStatic1() {
        repeat();
    }

    /**
     * private解决接口内重复问题
     */
    private static void repeat() {
        System.out.println("这是一个静态的接口方法（这是一个被静态方法调用内嵌私有的方法（可以解决代码重复问题）） tips： 私有方法只能被当前接口使用");
    }

    /**接口中的常量前缀是隐式标识符"public static final“
     * <p>一旦赋值不能更改</p>
     * 如果没有赋值则默认是0
     */
    int NUM = 12;
}
