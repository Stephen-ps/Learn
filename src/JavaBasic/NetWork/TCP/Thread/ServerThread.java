package JavaBasic.NetWork.TCP.Thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server
 * @author Stephen
 * @date 2021-05-14 01:48
 **/
public class ServerThread {
    public static void main(String[] args) {
        System.out.println("ServerThread start");
        ServerSocket ss;
        Socket s;
        int count = 0;
        try {
            // 1. 创建套接字：指定服务器的端口号
            ss = new ServerSocket(8888);
            // 2. 等着客户端发来的信息：
            //noinspection InfiniteLoopStatement
            while (true) {//加入死循环，服务器一直监听
                s = ss.accept();//阻塞方法：等待接收客户端的数据，什么时候接收到数据，什么时候程序继续向下执行
                //每次过来的客户端请求 靠 线程 请求
                new SerThread(s).start();
                count++;
                System.out.println("访问量: " + count + "/n" + "IP: " + s.getInetAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}