package Example;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

// @Target: 定义当前的注解能够修饰程序中的那些元素
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
// @Retention：定义注解的生命周期：
// SOURCE：编译曾
// RUNTIME：运行层
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value();//属性
}
