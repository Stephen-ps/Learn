package JavaBasic.Array.ArrayReverseMethod;

import JavaBasic.Array.MethodInterface.MethodOfArray;

import java.util.Arrays;
import java.util.Comparator;

/**
 * This is the first method for reverse the array
 * Here overwrite Comparator to call the method to reverse the array.
 */
public class arrayReverse1 {

    public static void main(String[] args) {

        //set up an array
        Integer[] array = new Integer[20];

        //fill in the number of this array, the order is increasing
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        System.out.println("This is the array with increasing order: " + Arrays.toString(array));

        //this is for store the reverse array in another.
        Integer[] arrayReverse = Arrays.copyOf(array, array.length);

        //set up the instance.
        Comparator<Integer> cmp = new MethodOfArray.MyComparator();

        //sort arrayList with the descending order.
        Arrays.sort(arrayReverse, cmp);
        System.out.println("This is the array with descending order: " + Arrays.toString(arrayReverse));
    }
}
