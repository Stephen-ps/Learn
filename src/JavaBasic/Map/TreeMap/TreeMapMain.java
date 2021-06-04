package JavaBasic.Map.TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapMain {
    public static void main(String[] args) {
        //按名字排序
        Comparator<Student> cmp = new MyComparatorName();
        Map<Student, Integer> treeMap = new TreeMap<>(cmp);

        treeMap.put(new Student("A", 25, 172), 903927446);
        treeMap.put(new Student("B", 23, 178), 903927448);
        treeMap.put(new Student("C", 22, 172), 903927449);

        System.out.println(treeMap);

    }
}
