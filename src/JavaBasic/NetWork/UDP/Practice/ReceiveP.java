package JavaBasic.NetWork.UDP.Practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 接收方
 * @author Stephen
 * @date 2021-05-14 21:37
 **/
public class ReceiveP {
    public static void main(String[] args) {
        System.out.println("日白");
        DatagramSocket ds = null;
        try {
            // 1.创建Socket: 指定接受方端口：
            ds = new DatagramSocket(9996);
            //noinspection InfiniteLoopStatement
            while (true) {
                // 2.有一个空的数据包，用来接收发送方传过来的数据
                byte[] receiveData = new byte[1024];
                DatagramPacket dpReceive = new DatagramPacket(receiveData, receiveData.length);
                // 3.接受对方的数据包，放入接收方准备好的数据包里。
                ds.receive(dpReceive);
                // 4. 取出数据
                String str = new String(dpReceive.getData(), 0, dpReceive.getLength());
                System.out.println("库亚特: " + str);


                //双向通信，回复发送方，这个数组用来发送数据
                Scanner sc = new Scanner(System.in);
                System.out.print("Steven: ");
                byte[] sendData = sc.next().getBytes(StandardCharsets.UTF_8);
                //把数组封装进数据报包里，发送指定IP地址和端口
                DatagramPacket dpSend = new DatagramPacket(sendData, sendData.length,
                        InetAddress.getByName("localhost"), 9997);

                //将数据报包发送出去
                ds.send(dpSend);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // close IOStream
            assert ds != null;
            ds.close();
        }
    }
}
