package Example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射调用和使用构造器
 *
 * @author Stephen
 * @date 2021-05-17 16:08
 **/
public class getConstruction {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 通过字节码信息获取构造器
        Class<Student> stuClass = Student.class;
        // 获取这个Student类里的全部构造器
        Constructor<?>[] c = stuClass.getDeclaredConstructors();
        // 遍历输出打印所有构造器
        for (Constructor<?> constructor : c) {
            System.out.println(constructor);
        }
        //输出结果
        /*public Example.Student()
        protected Example.Student( double,double,double)
        Example.Student( int,double)
        private Example.Student( int,double,double,double)
        public Example.Student( int,double,double)*/
        System.out.println("------------------------------------------------------------------------");

        // 获取指定构造器,在获取构造器时指定构造器的参数类型，和使用构造器一样，只不过时类型后面是.class
        // 可以获取被private修饰的构造器
        Constructor<Student> c1 =
                stuClass.getDeclaredConstructor(int.class, double.class, double.class);
        System.out.println(c1);

        // 通过反射调用构造器
        Object o1 = c1.newInstance(1, 3.0, 3.0);

        //Object o1 = c1.getDeclaredConstructor(int.class, double.class, double.class).newInstance(1, 3.0, 3.0)
        System.out.println(o1);// Student{sno=1, height=3.0, weight=3.0, score=0.0}
    }
}
