package JavaBasic.Generic.Inheried;

import java.util.ArrayList;

/**
 * @author Steven
 * @date 2021/5/11
 */
public class Main {
    public static void main(String[] args) {
        //给父类赋值
        Father<String, Integer> father = new Father<>("qwe", 123);

        System.out.println(father);

        //给子类赋值
        Son<String, Integer, String> son = new Son<>("123", 123, "qwe");
        System.out.println(son);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 123);
        list.add(1, 456);
        list.add(2, 789);
        list.add(3, 345);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 789) {
                System.out.println(i);
            }
        }
    }
}


