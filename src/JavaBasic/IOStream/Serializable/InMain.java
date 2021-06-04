package JavaBasic.IOStream.Serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Stephen
 * @date 2021-05-13 04:19
 **/
class InMain {
    public static void main(final String[] args) throws IOException,
            ClassNotFoundException {
        // input 对象流
        ObjectInputStream ois = new ObjectInputStream
                (new FileInputStream("D:\\OIOS2.txt"));
        //读取
        Person p = (Person) (ois.readObject());
        System.out.println(p);
        //close
        ois.close();
    }
}
