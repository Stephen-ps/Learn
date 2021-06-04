package JavaBasic.Interface;

public class MyInterfaceMain {
    public static void main(String[] args) {
        /*创建接口实现类的对象*/
        MyInterfaceImpl impl = new MyInterfaceImpl();
        /*调用接口的抽象方法*/
        impl.methodAbs();
        /*调用接口的默认方法*/
        impl.method();
        /*调用静态的接口方法*/
        MyInterface.methodStatic();
        /*调用接口里重复使用的私有方法*/
        MyInterface.methodStatic1();
        /*接口中的常量（这个常量不能更改）*/
        System.out.println("这是接口中的常量（不能更改): " + MyInterface.NUM);
    }
}
