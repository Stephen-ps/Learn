package JavaBasic.Thread.SetDaemon;

/**
 * Set Daemon
 * @author Stephen
 * @date 2021-05-15 00:10
 **/
class Daemon extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("second------" + i);
        }
    }
}

/**
 * Main
 */
class Main {
    public static void main(String[] args) {
        Daemon d = new Daemon();
        d.setDaemon(true);//设置伴随线程，随着主线程结束而结束。注意：结束有一个时间间隔，所以子程序在主程序结束后再运行这个间隔
        d.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("main-------" + i);
        }
    }
}
