package JavaBasic.Set.HashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Method> set = new HashSet<>();

        Method t = new Method("Monica", 32);
        Method t1 = new Method("Monica", 32);
        //检查地址值
        System.out.println(t.hashCode());
        //检查地址值
        System.out.println(t1.hashCode());
        //判断两个元素的地址值是否相同
        boolean qwe = t == t1;
        System.out.println("两个对象的地址是否一样：" + qwe);
        set.add(t);
        set.add(t1);
        //输出检查是狗会有两个相同的元素被打印
        System.out.println(set);
    }
}
