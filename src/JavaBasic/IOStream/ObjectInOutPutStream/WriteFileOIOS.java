package JavaBasic.IOStream.ObjectInOutPutStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Stephen
 * @date 2021-05-13 03:19
 **/
public class WriteFileOIOS {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\OIOS.txt"));
        //将内存中的字符串写入文件中
        oos.writeObject("你好");
        //close
        oos.close();
    }
}
