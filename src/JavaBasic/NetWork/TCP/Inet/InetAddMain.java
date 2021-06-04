package JavaBasic.NetWork.TCP.Inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 封装IP
 * @author Stephen
 * @date 2021-05-13 16:00
 **/
public class InetAddMain {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getByName("192.168.1.6");//CMD调出的本机ipv4的地址
        System.out.println(ia);
        InetAddress ia2 = InetAddress.getByName("localhost");//localhost指的时本机IP地址
        System.out.println(ia2);
        InetAddress ia4 = InetAddress.getByName("DESKTOP-1P7J6PQ");//封装计算机名也会获取ipv4的地址
        System.out.println(ia4);
        InetAddress ia5 = InetAddress.getByName("www.bbbb.com");
        System.out.println(ia5);
    }
}