package JavaBasic.Thread.CommunicationIssue.Lock;

/**
 * 生产者线程
 *
 * @author Stephen
 * @date 2021-05-15 18:03
 **/
public class ProducerThread extends Thread {
    //共享商品
    private final Product product;

    /**
     * 构造器
     *
     * @param product 商品
     */
    public ProducerThread(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 2; i++) {
            product.lock.lock();
            try {
                if (product.isLight())
                    try {
                        // 等待消费
                        product.producerLock.await();//线程等待， 释放同步锁
                        System.out.println("producerLock");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                if (i % 2 == 0) {
                    product.setBrand("费列罗");
                    product.setName("巧克力");
                } else {
                    product.setBrand("哈尔冰");
                    product.setName("啤酒");
                }
                product.setLight(true);
                //print
                System.out.println("生产者生产了: " + product.getBrand() + "---" + product.getName());
                product.customersLock.signal();
            } finally {
                product.lock.unlock();
            }

        }
    }
}
