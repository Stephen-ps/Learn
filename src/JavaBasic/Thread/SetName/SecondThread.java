package JavaBasic.Thread.SetName;

import org.jetbrains.annotations.NotNull;

/**
 * 第二个线程
 * @author Stephen
 * @date 2021-05-14 22:03
 **/
public class SecondThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(super.getName() + i);
        }
    }

    /**
     * 构造器，更改线程名字
     * @param name 线程名字
     */
    public SecondThread(@NotNull String name) {
        super(name);
    }
}
