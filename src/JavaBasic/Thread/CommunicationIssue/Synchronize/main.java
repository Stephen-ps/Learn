package JavaBasic.Thread.CommunicationIssue.Synchronize;

/**
 * 主线程
 * @author Stephen
 * @date 2021-05-15 18:14
 **/
public class main {
    public static void main(String[] args) {
        //共享商品
        Product p = new Product();
        ProducerThread pt = new ProducerThread(p);
        pt.start();
        CustomerThread ct = new CustomerThread(p);
        ct.start();
    }
}