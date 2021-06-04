package JavaBasic.Thread.Priority;

/**
 * 设置优先级
 * @author Stephen
 * @date 2021-05-14 23:30
 **/
class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 9; i++) {
            System.out.println("t1: "+i);
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 9; i++) {
            System.out.println("t2: "+i);
        }
    }
}

class MainThread{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();
    }
}