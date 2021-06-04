package JavaBasic.Generic;

public class GenericMain {
    public static void main(String[] args) {
        /*这里的<String>就是申明这个对象是什么类型的对象*/
        GenericClass<String> genericClass = new GenericClass<>();
        genericClass.setName("这是因为申明了类的类型，所以这里只能是String类型");
        System.out.println(genericClass.getName());

        /*定义一个int类型的对象*/
        new GenericClass<Integer>().setName(50);
        System.out.println("因为这里申明了这个对象为Integer，所以这里的参数只能输入Int类型: 50");

        System.out.println("===================================");

        //创建一个的对象
        GenericMethod genericMethod = new GenericMethod();
        //调用普通的泛型方法
        genericMethod.GenericNormalMethod("这里可以是任意参数类型");
        //调用静态泛型方法
        GenericMethod.GenericStaticMethod("这里是静态泛型方法，可以是任意参数类型");

        System.out.println("===================================");

        //创建一个接口实例
        GenericInterface<String> genericInterface = new GenericInterfaceImpl<>();
        genericInterface.GenericInterfaceMethod("这里是接口的泛型方法，这里也可以是任意类型");


    }
}
