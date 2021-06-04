package JavaBasic.Array.MethodInterface;

import java.util.ArrayList;
import java.util.Arrays;

/**这个用来测试我自己写的Array的接口是否是按照我的格式输出*/
 class testMethodOfArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] array = new int[10];

        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }

        MethodOfArray.printArrayList(list);
        System.out.println(Arrays.toString(array));
    }
}
