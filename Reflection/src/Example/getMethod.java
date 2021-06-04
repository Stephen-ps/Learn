package Example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 通过反射获取和操作方法
 *
 * @author Stephen
 * @date 2021-05-17 16:49
 **/
public class getMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取类的字节码对象
        Class<?> stuClass = Class.forName("Example.Student");
        // 通过反射输出打印字节码对象的所有方法
        Method[] stuMethods = stuClass.getDeclaredMethods();
        for (Method stuMethod : stuMethods) {
            System.out.println(stuMethod);
        }

        System.out.println("=====================================================");

        // 创建一个类对象的实例
        Object stuObj = stuClass.getDeclaredConstructor().newInstance();
        System.out.println(stuObj);

        // 获取类的方法
        Method happy = stuClass.getDeclaredMethod("happy");
        System.out.println(happy);

        // 调用类的方法
        happy.invoke(stuObj);

    }
}