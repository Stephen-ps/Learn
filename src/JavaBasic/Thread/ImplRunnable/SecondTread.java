package JavaBasic.Thread.ImplRunnable;

/**
 * 实现Runnable接口来创建线程
 * @author Stephen
 * @date 2021-05-14 22:26
 **/
public class SecondTread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
