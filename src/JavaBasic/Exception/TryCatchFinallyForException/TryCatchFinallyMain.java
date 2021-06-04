package JavaBasic.Exception.TryCatchFinallyForException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyMain {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("第一个数字: ");
        //会出现Exception in thread "Daemon" java.util.InputMismatchException
        int num1 = scanner.nextInt();
        System.out.println("第二数字: ");
        //Exception in thread "Daemon" java.lang.ArithmeticException: / by zero
        int num2 = scanner.nextInt();
        System.out.println("商: " + num1 % num2);*/


        int num1 = 0;
        int num2 = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("第一个数字: ");
            num1 = scanner.nextInt();
            System.out.println("第二数字: ");
            num2 = scanner.nextInt();
            System.out.println("商: " + num1 % num2);
            //只有这一种情况不执行finally
            System.exit(0);
            return;
        } catch (ArithmeticException e) {
            throw e;
        } catch (InputMismatchException e) {
            System.out.println("第一个数字必须为一个整数");
        } finally {
            System.out.println("===========================");
        }
    }
}
