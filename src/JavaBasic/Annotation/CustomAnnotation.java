package JavaBasic.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * <p>展示自定义注解的使用方法。如果定义的是一个{@code String[]}类型的数组，那么就必须在使用时声明{@code value}的值是多少。</p>
 * <p>@Retention(RetentionPolicy.SOURCE) 声明这个注解的生命周期，这里是只在源文件中生效</p>
 * @author Stephen
 * @date 2021-05-12 04:28
 **/
@Retention(RetentionPolicy.SOURCE)
public @interface CustomAnnotation {
        String[] value();
}
