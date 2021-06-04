package JavaBasic.Collections;


import JavaBasic.Array.MethodInterface.MethodOfArray;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 这是一个Collections工具类的展示
 */
public class CollectionsToolsClassMain {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //addAll的用法----减少代码行数
        Collections.addAll(list, "H", "A", "J", "B");
        System.out.print("集合本身: ");
        MethodOfArray.printArrayList(list);
        System.out.println("=====================================================");

        //按升序排序
        Collections.sort(list);
        System.out.println("排序后的集合: " + list);
        /*
         * 二分查找法：binarySearch
         * 二分查找法必须是再一个有序的集合里使用，不然会出现错误索引（负值）
         */
        System.out.println("Key值在集合的" + " " + Collections.binarySearch(list, "B") + " " + "位置上");

        System.out.println("=====================================================");
        /*
         * Collections.Copy
         * 实际上是一个替换的方法，会从索引0开始向后替换，没有被替换的保持不变。
         */
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "N", "k");
        Collections.copy(list, list2);
        System.out.println(list);
        System.out.println(list2);

        System.out.println("=====================================================");
        /*
         * Collections.fill
         * 将集合内的所有元素替换成指定元素
         */
        Collections.fill(list2,"ABBYY");
        MethodOfArray.printArrayList(list2);
    }
}
