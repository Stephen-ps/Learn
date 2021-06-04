package JavaBasic.NetWork.TCP.Inet;

import java.net.InetSocketAddress;

/**
 * 封装端口号
 * @author Stephen
 * @date 2021-05-13 16:14
 **/
public class InetSocketAddMain {
    public static void main(String[] args) {
        //封装端口号
        InetSocketAddress isa = new InetSocketAddress("localhost",8080);
        System.out.println(isa);
        System.out.println(isa.getHostName());
        System.out.println(isa.getPort());
    }
}