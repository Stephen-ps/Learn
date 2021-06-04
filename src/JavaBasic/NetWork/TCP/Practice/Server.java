package JavaBasic.NetWork.TCP.Practice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Stephen
 * @date 2021-05-14 01:48
 **/
public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1. 创建套接字：指定服务器的端口号
        ServerSocket ss = new ServerSocket(8888);
        // 2. 等着客户端发来的信息：
        Socket s = ss.accept();//阻塞方法：等待接收客户端的数据，什么时候接收到数据，什么时候程序继续向下执行
        // accept()返回值为一个Socket，这个Socket是客户段的Socket
        // 接到这个Socket以后，客户端和服务器才真正产生了连接，才真正可以通信了。
        // 3. 操作流：
        InputStream inputStream = s.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(inputStream);
        // 4. 读取客户端发来的数据：
        User user = (User) (ois.readObject());
        // 5. 对对象进行验证：
        boolean flag = user.getAccount().equals("娜娜")
                && user.getPassword().equals("1213");

        // 6. 向客户端返回接受成功语句
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        //检查账号密码是否正确
        if (!flag) {
            dos.writeUTF("账号密码错误");
            dos.writeBoolean(false);
        }


        dos.close();
        os.close();
        ois.close();
        inputStream.close();
        s.close();
        ss.close();
    }
}
