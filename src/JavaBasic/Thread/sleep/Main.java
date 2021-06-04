package JavaBasic.Thread.sleep;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * sleep 等待执行
 * @author Stephen
 * @date 2021-05-14 23:59
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //noinspection InfiniteLoopStatement
        while (true) {
            // 1. get the current time
            Date d = new Date();
            // define a format for time
            DateFormat df = new SimpleDateFormat("HH:mm:ss");
            System.out.println(df.format(d));
            Thread.sleep(500);
        }
    }
}
