package JavaBasic.Thread.ImplCallable;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 通过实现Callable接口来创建线程
 * @author Stephen
 * @date 2021-05-14 22:47
 **/
public class SecondThread implements Callable<Integer> {
    @Override
    public Integer call() {
        return new Random().nextInt(10);
    }
}


class Test{
    public static void main(String[] args) {
        SecondThread st = new SecondThread();
        FutureTask<Integer> ft = new FutureTask<>(st);
        Thread t = new Thread(ft);
        t.start();

        try {
            System.out.println(ft.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
