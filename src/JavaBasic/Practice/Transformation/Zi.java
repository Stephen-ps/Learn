package JavaBasic.Practice.Transformation;

public class Zi extends Fu implements test{

    @Override
    public void FuMethod() {
        System.out.println("重写Fu");
    }

    @Override
    public void Interface() {
        System.out.println("实现接口");
    }

    public void ZiMethod(){
        System.out.println("子特有");
    }
}