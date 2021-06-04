package JavaBasic.Array.ChangedParas;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class changedPars {
    public static int add(int @NotNull ... IntNum) {
        int sum = 0;
        for (int i : IntNum) {
            sum += i;
        }
        System.out.println("集合的元素为: " + Arrays.toString(IntNum));
        System.out.println("集合的长度为: " + IntNum.length);
        return sum;
    }
}
