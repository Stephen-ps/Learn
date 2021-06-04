package JavaBasic.IOStream.FileWR;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Stephen
 * @date 2021-05-12 16:52
 **/
public class FileReaderMain {
    public static void main(String[] args) throws IOException {
        //文件-->程序
        //1. 有一个文件
        File file = new File("D:\\Test.txt");
        //System.out.println(file.exists());

        //2. 利用FileReader这个流，创建一个FileReader的流对象
        FileReader fr = new java.io.FileReader(file);

        //3. 读取动作,遍历文件中的所有字符(单字符一个一个读取）
        /*int n;
        while ((n = fileReader.read()) != -1) {
            System.out.println((char)n);
        }*/

        //3.1 第二种遍历写法：

        /*int n = fileReader.read();
        while (n != -1) {
            System.out.println(*//*(char)*//*n);
            n = fileReader.read();
        }*/


        //创建一个Char数组，规定数组的长度
        char[] ch = new char[5];
        //把文件里的元素按数组的长度填充刀数组里，然后赋予给length这个变量
        //注意：此时ch这个数字已经被文件里的字符按数组长度填充了。
        int len = fr.read(ch);
        /*System.out.println(ch);*/
        //遍历方式1：
        while (len != -1) {
            for (int i = 0; i < len; i++) {
                System.out.println(ch[i]);
                System.out.println("len: " + len);
            }

            len = fr.read(ch);
            System.out.println("len: " + len);
        }

        //遍历方式2：
        /*while (len != -1) {
            String str = new String(ch,0,len);
            System.out.println(str);
            len = fr.read(ch);
        }*/


        //4. 不读了就要关闭流
        //流，数据库，网络资源，靠JVM本身不能关闭流，必须手动关闭
        fr.close();


    }
}
