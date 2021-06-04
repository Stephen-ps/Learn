package JavaBasic.IOStream.FileWR;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Stephen
 * @date 2021-05-12 17:53
 **/
public class FileWriterMain {
    public static void main(String[] args) throws IOException {
        //1. 有一个文件
        File file = new File("D:\\Test1.txt");

        //2. 利用FileWriter这个流，创建一个FileReader的流对象
        //true在源文件后面进行追加操作
        //false对源文件进行覆盖操作
        FileWriter fw = new FileWriter(file,true);
        /*FileWriter fw = new FileWriter(file, false);*/

        //3. 开始输出动作：
        String str = "Hello你好";
        for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
        }
        //4. 关闭流
        fw.close();
    }
}
