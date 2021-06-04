package JavaBasic.NetWork.TCP.Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Stephen
 * @date 2021-05-14 00:47
 **/
public class Server {
    public static void main(String[] args) throws IOException {
        // 1. 创建套接字：指定服务器的端口号
        ServerSocket ss = new ServerSocket(8888);
        // 2. 等着客户端发来的信息：
        Socket s = ss.accept();//阻塞方法：等待接收客户端的数据，什么时候接收到数据，什么时候程序继续向下执行
        // accept()返回值为一个Socket，这个Socket是客户段的Socket
        // 接到这个Socket以后，客户端和服务器才真正产生了连接，才真正可以通信了。
        // 3. 操作流：
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        // 4. 读取客户端发来的数据：
        System.out.println("客户端发来的数据： " + /*inputStream.read() + */dis.readUTF());

        // 5.向客户端返回一句接受语句
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("收到收到");

        // 6. close
        dos.close();
        os.close();
        dis.close();
        is.close();
        s.close();
        ss.close();
    }
}
