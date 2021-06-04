package JavaBasic.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * This is for to find the odd number in "A" arrayList to add in and store in "B" arrayList
 */
public class ArrayListMain {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int r = random.nextInt(101);
            arrayList.add(r);
        }
        //re-order: Ascending
        Collections.sort(arrayList);
        //print it.
        System.out.println(arrayList);


        //Add the odd number in an new array list
        ArrayList<Integer> oddArrayList = new ArrayList<>();
        for (Integer oddNum : arrayList) {
            if (oddNum % 2 == 0) {
                oddArrayList.add(oddNum);
            }
        }

        System.out.println();;
        System.out.println(oddArrayList);
    }
}