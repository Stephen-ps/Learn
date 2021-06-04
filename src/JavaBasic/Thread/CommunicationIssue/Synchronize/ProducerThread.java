package JavaBasic.Thread.CommunicationIssue.Synchronize;

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
        for (int i = 1; i <= 5; i++) {
            synchronized (product) {//线程同步
                if (product.isLight()) {
                    try {
                        // 等待消费
                        product.wait();//线程等待， 释放同步锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
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
                product.notify();//唤醒另一个线程，让另一个线程从wait（）处开始执行代码
            }
        }
    }
}