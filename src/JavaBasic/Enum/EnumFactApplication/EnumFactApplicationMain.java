package JavaBasic.Enum.EnumFactApplication;

/**
 * @author Stephen
 * @date 2021-05-12 07:21
 **/
public class EnumFactApplicationMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(19);
        person.setName("lili");
        person.setSex(Gender.MEN);
        System.out.println(person);
    }
}
