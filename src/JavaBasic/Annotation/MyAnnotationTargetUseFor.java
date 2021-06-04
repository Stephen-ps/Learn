package JavaBasic.Annotation;

/**
 * @author Stephen
 * @date 2021-05-12 05:40
 **/
@SuppressWarnings("unused")
@MyAnnotationTarget
public class MyAnnotationTargetUseFor {
    @MyAnnotationTarget
    public void method() {
    }

    @MyAnnotationTarget
    int age = 0;

}
