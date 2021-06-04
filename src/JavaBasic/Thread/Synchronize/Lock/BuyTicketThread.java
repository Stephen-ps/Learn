package JavaBasic.Thread.Synchronize.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程同步
 * @author Stephen
 * @date 2021-05-15 16:44
 **/
public class BuyTicketThread implements Runnable {
    int ticketNum = 10;

    // 创建锁对象
    Lock lock = new ReentrantLock();//多态， 接口=实现类 可以使用不同的实现类

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            //打开锁
            //需要抓取异常
            lock.lock();
            try {
                if (ticketNum > 0) {
                    System.out.println("我在" + Thread.currentThread().getName() +
                            "买到了第" + ticketNum-- + "张车票");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                //关闭锁
                lock.unlock();
            }
        }
    }
}