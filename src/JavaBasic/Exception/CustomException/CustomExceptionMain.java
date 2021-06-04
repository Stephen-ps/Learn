package JavaBasic.Exception.CustomException;

import java.util.Scanner;

/**
 * @author: Steven
 * @date: 2021/5/5
 */
public class CustomExceptionMain {
    static String[] userNames = {"a", "b", "c"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your User Name: ");
        String userName = scanner.next();
        checkUserName(userName);

    }

    public static void checkUserName(String userName) {
        for (String name : userNames) {
            if (name.equals(userName)) {
                throw new RegisterException("This has already registered");
            }
        }
        System.out.println("congratulations");
    }
}

