package JavaBasic.NetWork.TCP.Socket;

import java.io.*;
import java.net.Socket;

/**
 * @author Stephen
 * @date 2021-05-14 00:47
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        // 1. 创建socket
        Socket s = new Socket("192.168.1.6", 8888);
        // 2. 向外发送数据---->IO流
        OutputStream os = s.getOutputStream();
        // 传输String
        DataOutputStream dos = new DataOutputStream(os);
        // 3. 利用OutputStream向外发送数据，但是没有直接发送String的方法。
        // os.write(213);
        dos.writeUTF("你好");
        // 4. 接收服务器反馈：
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        System.out.println(dis.readUTF());
        // 5. close Stream
        dis.close();
        is.close();
        dos.close();
        os.close();
        s.close();
    }
}
