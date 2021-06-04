package JavaBasic.Thread.Synchronize.Block;

/**
 *
 * @author Stephen
 * @date 2021-05-15 16:47
 **/
public class Main {
    public static void main(String[] args) {
        BuyTicketThread bt = new BuyTicketThread();
        Thread t1 = new Thread(bt,"窗口1");
        t1.start();
        Thread t2 = new Thread(bt,"窗口2");
        t2.start();
        Thread t3 = new Thread(bt,"窗口3");
        t3.start();
    }
}
