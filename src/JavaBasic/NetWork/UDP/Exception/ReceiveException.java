package JavaBasic.NetWork.UDP.Exception;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author Stephen
 * @date 2021-05-14 21:12
 **/
public class ReceiveException {
    public static void main(String[] args) {
        System.out.println("老师上线了.....");
        DatagramSocket ds = null;
        try {
            // 1.创建Socket: 指定接受方端口：
            ds = new DatagramSocket(9999);
            // 2.有一个空的数据包，用来接收发送方传过来的数据
            byte[] receiveData = new byte[1024];
            DatagramPacket dpReceive = new DatagramPacket(receiveData, receiveData.length);
            // 3.接受对方的数据包，放入接收方准备好的数据包里。
            ds.receive(dpReceive);
            // 4. 取出数据
            String str = new String(dpReceive.getData(), 0, dpReceive.getLength());
            System.out.println("接收: " + str);


            //双向通信，回复发送方，这个数组用来发送数据
            Scanner sc = new Scanner(System.in);
            System.out.print("发送: ");
            byte[] sendData = sc.next().getBytes(StandardCharsets.UTF_8);
            //把数组封装进数据报包里，发送指定IP地址和端口
            DatagramPacket dpSend = new DatagramPacket(sendData, sendData.length,
                    InetAddress.getByName("localhost"), 9998);

            //将数据报包发送出去
            ds.send(dpSend);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // close IOStream
            assert ds != null;
            ds.close();
        }
    }
}
