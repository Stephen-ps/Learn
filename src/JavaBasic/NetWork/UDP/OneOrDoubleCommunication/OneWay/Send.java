package JavaBasic.NetWork.UDP.OneOrDoubleCommunication.OneWay;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 发送方
 * @author Stephen
 * @date 2021-05-14 19:47
 **/
public class Send {
    public static void main(String[] args) throws IOException {
        System.out.println("学生上线.....");
        // 1.准备Socket
        DatagramSocket ds = new DatagramSocket(9998);


        String str = "你好";
        byte[] bytes = str.getBytes();
        // 2.准备数据包
        /* 2.1 buf: 传输的数据转为字节数组
         * 2.2 length 数组长度
         * 2.3 address：封装接收方的IP
         * 2.4 指定接收方端口
         */
        DatagramPacket dp =
                new DatagramPacket(bytes, bytes.length,
                        InetAddress.getByName("localhost"), 9999);

        //发送
        ds.send(dp);

        //close IO
        ds.close();
    }
}