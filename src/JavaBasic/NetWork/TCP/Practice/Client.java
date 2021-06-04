package JavaBasic.NetWork.TCP.Practice;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Stephen
 * @date 2021-05-14 01:48
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        // 1. 创建socket
        Socket s = new Socket("192.168.1.6", 8888);
        // 2. 录入用户账号和密码：
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的账号: ");
        String acc = sc.next();
        System.out.println("请输入您的密码: ");
        String pwd = sc.next();

        //通过操作对象将数据写入output流
        User user = new User(acc, pwd);

        OutputStream os = s.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(user);

        //接受客户端返回语句
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        System.out.println("客户端返回语句: " + dis.readUTF() + "\n" +
                "返回值： " + dis.readBoolean());


        dis.close();
        is.close();
        oos.close();
        os.close();
        s.close();

    }
}
