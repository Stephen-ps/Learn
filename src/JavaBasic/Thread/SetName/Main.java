package JavaBasic.Thread.SetName;

/**
 * <p>启动线程</p>
 * 子线程必须在主线程程序执行前启动
 *
 * @author Stephen
 * @date 2021-05-14 22:03
 **/
public class Main {
    public static void main(String[] args) {

        Thread.currentThread().setName("主线程: ");
        //创建多第二个线程的对象：改名字
        SecondThread st = new SecondThread("子线程: ");
        //启动线程
        st.start();

        // 主线程执行
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
