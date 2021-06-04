package JavaBasic.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class CompareToMain {
    public static void main(String[] args) {
        ArrayList<orderCompareTo> list = new ArrayList<>();
        list.add(new orderCompareTo("A",20));
        list.add(new orderCompareTo("B",19));
        list.add(new orderCompareTo("C",50));
        //根据规则排序
        Collections.sort(list);
        System.out.println(list);
    }
}
