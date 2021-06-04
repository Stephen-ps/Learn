package JavaBasic.Thread.Extends;

/**
 * <p>启动线程</p>
 * 子线程必须在主线程程序执行前启动
 * @author Stephen
 * @date 2021-05-14 22:03
 **/
public class Main {
    public static void main(String[] args) {
        //创建多第二个线程的对象
        SecondThread st = new SecondThread();
        st.start();

        // 主线程执行
        for (int i = 0; i < 5; i++) {
            System.out.println("这是主线程: "+i);
        }
    }
}
