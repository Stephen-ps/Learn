package JavaBasic.NetWork.TCP.Exception;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server
 * @author Stephen
 * @date 2021-05-14 01:48
 **/
public class ServerTryCatch {
    public static void main(String[] args) {
        System.out.println("ServerThread start");
        ServerSocket ss = null;
        Socket s = null;
        InputStream inputStream = null;
        ObjectInputStream ois = null;
        boolean flag;
        OutputStream os = null;
        DataOutputStream dos = null;
        try {
            // 1. 创建套接字：指定服务器的端口号
            ss = new ServerSocket(8888);
            // 2. 等着客户端发来的信息：
            s = ss.accept();//阻塞方法：等待接收客户端的数据，什么时候接收到数据，什么时候程序继续向下执行
            // accept()返回值为一个Socket，这个Socket是客户段的Socket
            // 接到这个Socket以后，客户端和服务器才真正产生了连接，才真正可以通信了。
            // 3. 操作流：
            inputStream = s.getInputStream();
            ois = new ObjectInputStream(inputStream);
            // 4. 读取客户端发来的数据：
            User user = null;
            try {
                user = (User) (ois.readObject());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            // 5. 对对象进行验证：
            // 这里user不能为空，否则调取不到数据。
            assert user != null;
            flag = user.getAccount().equals("娜娜")
                    && user.getPassword().equals("1213");

            // 6. 向客户端返回接受成功语句
            os = s.getOutputStream();
            dos = new DataOutputStream(os);

            //检查账号密码是否正确
            if (!flag) {
                dos.writeUTF("账号密码错误");
                dos.writeBoolean(false);
            } else{
                dos.writeUTF("账号密码正确");
                dos.writeBoolean(true);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                if (dos != null) {
                    dos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (s != null) {
                    s.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (ss != null) {
                    ss.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
