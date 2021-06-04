package JavaBasic.Thread.CommunicationIssue.Synchronize;

/**
 * 消费者线程
 *
 * @author Stephen
 * @date 2021-05-15 18:12
 **/
public class CustomerThread extends Thread {
    private final Product product;

    public CustomerThread(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            synchronized (product) {//线程同步
                if (!product.isLight()) {
                    try {
                        product.wait();//线程等待， 释放同步锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("消费者消费了: " + product.getBrand() + "---" + product.getName());
                product.setLight(false);
                product.notify();//唤醒另一个线程执行代码，让另一个线程从wait（）处开始执行代码
            }
        }
    }
}