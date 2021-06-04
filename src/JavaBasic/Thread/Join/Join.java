package JavaBasic.Thread.Join;

import org.jetbrains.annotations.NotNull;

/**
 * Join方法：先执行调用Join方法的线程，完成生命周期后再执行其它线程。
 * @author Stephen
 * @date 2021-05-14 23:39
 **/
class Thread1 extends Thread {
    public Thread1(@NotNull String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.getName() + "-----" + i);
        }
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Daemon----" + i);
            if (i == 6) {
                Thread1 t1 = new Thread1("子线程");
                t1.start();
                t1.join();//先执行t1

            }
        }
    }
}
