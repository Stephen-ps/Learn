package JavaBasic.Practice.Transformation;

public class TransformationMain {

    public static void main(String[] args) {
        //多态，测试使用是否能够调用子类里重写的父类方法
        Fu fu = new Zi();
        fu.FuMethod();

        //多态，测试使用是否能够调用接口里的实现类
        test test = new Zi();
        test.Interface();

        //向下转型，使子类对象能够使用子类的特有方法。
        Zi zi = (Zi) test;
        zi.ZiMethod();
    }
}
