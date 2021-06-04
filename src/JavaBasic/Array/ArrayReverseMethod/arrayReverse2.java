package JavaBasic.Array.ArrayReverseMethod;

import java.util.Arrays;

/**
 * This is the second method for reverse the array
 * Here use the for loop to exchange the element in the array to reverse.
 */
public class arrayReverse2 {

    public static void main(String[] args) {
        //set up an array
        int[] array = new int[20];

        //fill in the number of this array, the order is increasing
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        //show the order with array.
        System.out.println("This is the array I create: " + Arrays.toString(array));

        //set up another array to store the reverse array
        int[] arrayReverse = Arrays.copyOf(array, array.length);

        //this is for reverse the number in array.
        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            //switch the order.
            int temp = arrayReverse[min];
            arrayReverse[min] = arrayReverse[max];
            arrayReverse[max] = temp;
        }

        System.out.println("This is the array I reorder: " + Arrays.toString(arrayReverse));

    }
}
