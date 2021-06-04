package JavaBasic.NetWork.UDP.Practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 发送方
 *
 * @author Stephen
 * @date 2021-05-14 21:37
 **/
public class sendP {
    public static void main(String[] args) {
        System.out.println("日白");
        DatagramSocket ds = null;
        try {
            // 1.准备数据报Socket
            ds = new DatagramSocket(9997);
            //noinspection InfiniteLoopStatement
            while (true) {
                //这个数组用来发送数据
                Scanner sc = new Scanner(System.in);
                System.out.print("库亚特: ");
                byte[] sendData = sc.next().getBytes(StandardCharsets.UTF_8);
                // 2.把数组封装进数据报包里，发送指定IP地址和端口
                /* 2.1 buf: 传输的数据转为字节数组
                 * 2.2 length 数组长度
                 * 2.3 address：封装接收方的IP
                 * 2.4 指定接收方端口
                 */
                DatagramPacket dpSend =
                        new DatagramPacket(sendData, sendData.length,
                                InetAddress.getByName("localhost"), 9996);
                //发送数据报包
                ds.send(dpSend);


                //接收receiveDW传过来的数据，这个数组用来接收数据
                byte[] receiveDate = new byte[1024];
                //接收数据的数据报包，把接收到的数据放入
                DatagramPacket dpReceive = new DatagramPacket(receiveDate, receiveDate.length);
                //接收数据报包
                ds.receive(dpReceive);
                //接收有效的数据
                String receiveStr = new String(dpReceive.getData(), 0, dpReceive.getLength());
                System.out.println("Steven: " + receiveStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //close IO
            assert ds != null;
            ds.close();
        }
    }
}