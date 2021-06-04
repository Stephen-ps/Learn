package JavaBasic.IOStream.Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Stephen
 * @date 2021-05-13 03:46
 **/
public class OutMain {
    public static void main(String[] args) throws IOException {
        //序列化：将内存中对象----> 文件：
        //1. 创建一个对象
        Person p = new Person("lili", 19);
        //2. out对象流
        ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream("D:\\OIOS2.txt"));
        //3. 向外写
        oos.writeObject(p);
        //4. 关闭流
        oos.close();
    }
}
