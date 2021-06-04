package JavaBasic.Annotation;

/**
 * 定义一个默认参数的String value
 * @author Stephen
 * @date 2021-05-12 05:09
 **/
@SuppressWarnings("unused")
public @interface CustomAnnotation2 {
    String value() default "abc";
}
