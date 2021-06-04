package JavaBasic.Thread.Extends;

/**
 * 第二个线程
 * @author Stephen
 * @date 2021-05-14 22:03
 **/
public class SecondThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("这是子线程: " + i);
        }
    }
}
