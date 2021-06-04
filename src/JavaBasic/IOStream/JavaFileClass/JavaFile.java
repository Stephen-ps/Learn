package JavaBasic.IOStream.JavaFileClass;

import java.io.File;
import java.io.IOException;

/**
 * @author Stephen
 * @date 2021-05-12 15:23
 **/
public class JavaFile {

    public static void main(String[] args) {
        //封装文件为一个对象
        File f1 = new File("C:\\Users\\54473\\Desktop\\Idea files\\IO.txt");
        File f2 = new File("C:\\Users\\54473\\Desktop\\Idea files\\IO.txt");
        File f3 = new File("IO.txt");
        /* File file = new File("C:/Files/IO.txt");
         File file = new File("C:"+File.separator+"Files/IO.txt");*/
        System.out.println("是否存在: " + f1.exists());
        //删除或者创建文件，
        /*if (f1.exists()) {
            System.out.println("执行了删除文件操作: " + f1.delete());
        } else {
            try {
                System.out.println("执行了创建文件操作: " + f1.createNewFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        System.out.println("文件是否可读: " + f1.canRead());
        System.out.println("文件是否可写: " + f1.canWrite());
        System.out.println("文件的名字: " + f1.getName());
        System.out.println("上级目录页: " + f1.getParent());
        System.out.println("是否是一个目录: " + f1.isDirectory());
        System.out.println("是否是一个文件: " + f1.isFile());
        System.out.println("是否隐藏: " + f1.isHidden());
        System.out.println("文件的大小: " + f1.length());

        System.out.println("两个对象的地址是否相等: " + (f1 == f2));//比较两个对象的地址
        System.out.println("两个对象的路径是否相等: " + (f1.equals(f2)));//比较两个对象的路径

        //和路径相关
        System.out.println("文件的绝对路径: " + f1.getAbsolutePath());
        System.out.println("文件的相对路径: " + f1.getPath());
        System.out.println(f1);

        if (!f3.exists()) {
            try {
                System.out.println("创建的文件是否成功: " + f3.createNewFile());
                System.out.println("文件的绝对路径: " + f3.getAbsolutePath());//电脑硬盘存放位置
                System.out.println("文件的相对路径: " + f3.getPath());//项目模块下的位置
                System.out.println(f3);//相对路径
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
