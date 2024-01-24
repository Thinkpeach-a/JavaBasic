package org.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AnnotationExample {
    @MyAnnotation2(name = "yida")
    public void test(){}
}
// 表示我们的注解用在哪些地方
@Target(value = {ElementType.METHOD, ElementType.TYPE})
@interface MyAnnotation{

}
@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    String name();
    // 只有一个value 可以省略
}