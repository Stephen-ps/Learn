package JavaBasic.Thread.ImplRunnable;

/**
 * 主线程
 * @author Stephen
 * @date 2021-05-14 22:27
 **/
public class Main {
    public static void main(String[] args) {
        SecondTread st = new SecondTread();
        Thread t = new Thread(st, "子线程: ");
        t.start();

        Thread.currentThread().setName("主线程: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
