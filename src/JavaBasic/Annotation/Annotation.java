package JavaBasic.Annotation;

@SuppressWarnings("unused")
public class Annotation {
    /**
     * 下面是eat方法，实现了xxx功能
     *
     * @param num1 就餐人数
     * @param num2 点了几个菜
     */
    @SuppressWarnings("unused")
    public void eat(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    /**
     * 这是一个案例方法，用于教学文档注释
     *
     * @param age 年龄
     *
     * @return int 返回值类型是一个整数年龄
     *
     * @throws RuntimeException          当年龄过大
     * @throws IndexOutOfBoundsException 当年龄出现0
     */
    @SuppressWarnings("unused")
    public int sleep(int age) {

        if (age > 100) {
            throw new RuntimeException();
        } else if (age < 0) {
            throw new IndexOutOfBoundsException();
        }
        return 10;
    }
}