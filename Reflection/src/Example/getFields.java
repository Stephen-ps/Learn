package Example;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射获取类的属性
 *
 * @author Stephen
 * @date 2021-05-17 16:24
 **/
public class getFields {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //获取类的字节码对象
        Class<?> stuClass = Class.forName("Example.Student");
        //通过字节码找到类里的属性
        Field[] stuFields = stuClass.getDeclaredFields();
        //遍历输出打印属性
        for (Field stuField : stuFields) {
            System.out.println(stuField);
        }

        System.out.println("==============================================");

        Field stuScore = stuClass.getDeclaredField("score");
        System.out.println(stuScore);
        /*// 属性的具体结构：
        // 获取属性的名字
        System.out.println(score.getName());
        // 获取属性的数据类型
        System.out.println(score.getType());
        // 获取属性的修饰符
        System.out.println(Modifier.toString(score.getModifiers()));*/

        //创建对象
        Object stuObj = stuClass.getDeclaredConstructor().newInstance();// Student stuObj = new Student();
        stuScore.set(stuObj, 30.0);//stuObj.setScore(30.0)
        System.out.println(stuObj);
    }
}