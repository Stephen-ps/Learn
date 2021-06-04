package JavaBasic.Annotation;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * Target 是一个元注解，用于修饰注解，在target括号必须指定被修饰的类型
 * @author Stephen
 * @date 2021-05-12 05:40
 **/

@Target({TYPE,FIELD,CONSTRUCTOR,METHOD})
public @interface MyAnnotationTarget {
}
