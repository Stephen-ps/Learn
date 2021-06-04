package Example;

/**
 * 学习反射
 *
 * @author Stephen
 * @date 2021-05-17 15:05
 **/
@MyAnnotation(value = "hello")
public class getClassByteInfo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //获取类
        // eg: Person.class
        // 得到class对象，方式1：
        Person p = new Person();
        Class<? extends Person> aClass = p.getClass();

        // 方式2：
        Class<Person> personClass = Person.class;
        System.out.println(personClass);

        // System.out.println(aClass.equals(personClass)); // true

        // 方式3：
        Class<?> forName = Class.forName("Example.Person");
        // System.out.println(forName == aClass && aClass == personClass && forName == personClass); //true

        //方式4：利用类的加载器
        ClassLoader loader = getClassByteInfo.class.getClassLoader();
        loader.loadClass("Example.Person");


    }
}