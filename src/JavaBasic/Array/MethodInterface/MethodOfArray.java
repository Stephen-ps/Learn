package JavaBasic.Array.MethodInterface;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Steven
 * <p></p>This is for printing Array
 */
public interface MethodOfArray {

    /**
     * This is for sort the array with descending order.
     */
    class MyComparator implements Comparator<Integer> {
        /**
         * <p>Compares its two arguments for order.  Returns a negative integer,
         * zero, or a positive integer as the first argument is less than, equal
         * to, or greater than the second.</p>
         */
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

    /**
     * This is for print array with the format
     */
    static void printArrayList(@NotNull ArrayList<?> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                System.out.print("[" + list.get(i) + "," + " ");
            } else if (i == list.size() - 1) {
                System.out.println(list.get(i) + "]");
            } else {
                System.out.print(list.get(i) + "," + " ");
            }
        }
    }

    static double sum(double @NotNull ... arr) {
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        return sum;
    }
}

