package JavaBasic.IOStream.JavaFileClass;

import java.io.File;

/**
 * @author Stephen
 * @date 2021-05-12 16:05
 **/
public class JavaDirectory {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\54473\\Desktop\\Idea files\\Directory\\Demo.txt");
        File f2 = new File("C:\\Users\\54473\\Desktop\\Idea files\\Directory\\Dir");
        File f3 = new File("C:\\Users\\54473\\Desktop\\Idea files\\Directory\\a\\b\\c\\d");
        File f4 = new File("C:\\Users\\54473\\Desktop\\Idea files\\Directory");
        System.out.println(f1);
        System.out.println("创建单层目录是否成功: " + f2.mkdir());//单层目录
        System.out.println("创建多层目录是否成功" + f3.mkdirs());//多层目录
        System.out.println("删除目录是否成功（如果返回false证明目录为非空）" + f2.delete());//删除目录，只会删除空的目录
        //删除目录，只会删除空的目录，多层目录下，非空目录不会被删除,只会删除最外层的非空目录
        System.out.println("删除目录是否成功（如果返回false证明目录为非空）" + f3.delete());

        System.out.println("=======================================================================");

        //获取目录下的文件
        File[] files = f4.listFiles();
        assert files != null;
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
