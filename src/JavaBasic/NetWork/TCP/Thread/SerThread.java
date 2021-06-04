package JavaBasic.NetWork.TCP.Thread;

import java.io.*;
import java.net.Socket;

/**
 * 线程：专门处理客户端的请求
 *
 * @author Stephen
 * @date 2021-05-14 03:45
 **/
public class SerThread extends Thread {
    Socket s;
    InputStream is = null;
    ObjectInputStream ois = null;
    boolean flag;
    OutputStream os = null;
    DataOutputStream dos = null;

    public SerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            is = s.getInputStream();
            ois = new ObjectInputStream(is);
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
            } else {
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
                if (is != null) {
                    is.close();
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