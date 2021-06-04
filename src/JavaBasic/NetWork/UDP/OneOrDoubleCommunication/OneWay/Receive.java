package JavaBasic.NetWork.UDP.OneOrDoubleCommunication.OneWay;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 接收方
 *
 * @author Stephen
 * @date 2021-05-14 20:01
 **/
public class Receive {
    public static void main(String[] args) throws IOException {
        System.out.println("老师上线了.....");
        // 1.创建Socket: 指定接受方端口：
        DatagramSocket ds = new DatagramSocket(9999);

        // 2.有一个空的数据包，用来接收发送方传过来的数据
        byte[] b = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b, b.length);

        // 3.接受对方的数据包，放入接收方准备好的数据包里。
        ds.receive(dp);

        // 4. 取出数据
        String str = new String(dp.getData(),0,dp.getLength());
        System.out.println("发送方传来的数据: " + str);

        // close IOStream
        ds.close();
    }
}