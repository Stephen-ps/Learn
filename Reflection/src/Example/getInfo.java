package Example;

import java.lang.annotation.Annotation;

/**
 * 通过反射获取其它信息
 *
 * @author Stephen
 * @date 2021-05-17 17:16
 **/
public class getInfo {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取类的字节码信息
        Class<?> stuClass = Class.forName("Example.Student");
        // 获取接口
        Class<?>[] stuInterfaces = stuClass.getInterfaces();
        //遍历打印接口：
        for (Class<?> stuInterface : stuInterfaces) {
            System.out.println(stuInterface);
        }

        // 获取父类的字节码信息：
        Class<?> stuSuperclass = stuClass.getSuperclass();

        // 获取父类的接口
        Class<?>[] superclass = stuSuperclass.getInterfaces();
        for (Class<?> aClass : superclass) {
            System.out.println(aClass);
        }

        //获取运行时类所在的包
        Package stuClassPackage = stuClass.getPackage();
        Package stuSuperClassPackage = stuSuperclass.getPackage();
        System.out.println("运行时父类所在的包: " + stuSuperClassPackage);
        System.out.println("运行时子类所在的包: " + stuClassPackage);

        //获取运行时类的注解：
        Annotation[] stuClassAnnotation = stuClass.getAnnotations();
        //遍历打印stuClass里的类注解
        for (Annotation annotation : stuClassAnnotation) {
            System.out.println(annotation);
        }
    }
}
