package JavaBasic.Thread.Synchronize.Method;

/**
 * 线程同步
 * @author Stephen
 * @date 2021-05-15 16:44
 **/
public class BuyTicketThread implements Runnable {
    static int ticketNum = 10;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (ticketNum > 0) {
                buyTicket();
            }
        }
    }

    /**
     * 线程同步方法
     * <p>在执行线程同步方法时，不能执行其它同步方法，CPU必须等待当前同步方法执行完毕后再执行其它同步方法。</p>
     */
    static synchronized void buyTicket() {
        System.out.println("我在" + Thread.currentThread().getName() +
                "买到了第" + ticketNum-- + "张车票");
    }
}