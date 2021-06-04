package JavaBasic.Generic;


/**<p>当不知道用什么数据类型的时候使用泛型</p>
 * <p>泛型可以接受任意的数据类型</p>
 * <p>注意:</p>
 * <p>1.写法为<字母></p>
 * <P>2.如果是定义一个方法，那么<字母>必须写在类名和接口名的后面</P>
 * <P>3.参数列表数据类型也改为泛型</P>
 */
public class GenericInterfaceImpl<T> implements GenericInterface<T> {
    @Override
    public void GenericInterfaceMethod(T t) {
        System.out.println(t);
    }
}
