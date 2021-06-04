package Example;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Stephen
 * @date 2021-05-17 15:04
 **/
public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = -3000766198982544002L;
    public String name;
    //属性
    private int age;

    private void eat() {
        System.out.println("Person---eat");
    }

    public void sleep() {
        System.out.println("Person---sleep");
    }
}
