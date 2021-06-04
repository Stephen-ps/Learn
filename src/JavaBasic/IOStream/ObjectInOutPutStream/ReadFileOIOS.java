package JavaBasic.IOStream.ObjectInOutPutStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Stephen
 * @date 2021-05-13 03:28
 **/
public class ReadFileOIOS {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //将文件中保存的字符串读到内存中
        ObjectInputStream ois = new ObjectInputStream
                (new FileInputStream("D:\\OIOS.txt"));
        //read
        String s = (String) (ois.readObject());
        System.out.println(s);
        //close
        ois.close();
    }
}
