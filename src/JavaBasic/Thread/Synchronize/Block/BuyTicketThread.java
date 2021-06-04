package JavaBasic.Thread.Synchronize.Block;

/**
 * 线程同步
 * @author Stephen
 * @date 2021-05-15 16:44
 **/
public class BuyTicketThread implements Runnable {
    int ticketNum = 10;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            //同步可能会出现线程安全问题的代码
            /*this 就是同步本身
            * 注意：用this这里只能是单一线程对象，如果是多线程对象同时使用这个代码，会出现错误
            */
            synchronized (this) {//同步线程，必须执行完之后才会由另外一个线程执行,
                if (ticketNum > 0) {
                    System.out.println("我在" + Thread.currentThread().getName() +
                            "买到了第" + ticketNum-- + "张车票");
                }
            }
        }
    }
}