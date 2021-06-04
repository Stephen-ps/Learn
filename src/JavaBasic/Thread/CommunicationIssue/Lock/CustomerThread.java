package JavaBasic.Thread.CommunicationIssue.Lock;

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
        for (int i = 1; i <= 2; i++) {
            product.lock.lock();//开始锁
            try {
                if (!product.isLight()) {
                    try {
                        product.customersLock.await();//线程等待
                        System.out.println("customersLock");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("消费者消费了: " + product.getBrand() + "---" + product.getName());
                product.setLight(false);
                product.producerLock.signal();//进入producerLock等待位置执行代码
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                product.lock.unlock();
            }
        }
    }
}