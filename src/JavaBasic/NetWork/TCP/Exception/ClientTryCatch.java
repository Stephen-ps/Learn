package JavaBasic.NetWork.TCP.Exception;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Client
 * @author Stephen
 * @date 2021-05-14 01:48
 **/
public class ClientTryCatch {
    public static void main(String[] args) {
        System.out.println("ClientThread start");
        Socket s = null;
        OutputStream os = null;
        ObjectOutputStream oos = null;
        InputStream is = null;
        DataInputStream dis = null;
        try {
            // 1. 创建socket
            s = new Socket("192.168.1.6", 8888);
            // 2. 录入用户账号和密码：
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的账号: ");
            String acc = sc.next();
            System.out.println("请输入您的密码: ");
            String pwd = sc.next();

            //通过操作对象将数据写入output流
            User user = new User(acc, pwd);

            os = s.getOutputStream();
            oos = new ObjectOutputStream(os);
            oos.writeObject(user);

            //接受客户端返回语句
            is = s.getInputStream();
            dis = new DataInputStream(is);
            System.out.println("客户端返回语句: " + dis.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dis != null) {
                    dis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (oos != null) {
                    oos.close();
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
                if (s != null) {
                    s.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
