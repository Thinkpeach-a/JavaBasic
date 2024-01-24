package org.example.reflection;
import org.example.AnnotationExample.*;

import java.io.FilterOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInform {
    public static void main(String args[]){
        Person person = new Person("yida");
        Class cl = person.getClass();
        System.out.println(cl.getName());
        Field[] fields = cl.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        Method[] methods = cl.getMethods();
        for (Method method: methods){
            System.out.println(method);
        }
    }
// getDecalredMethod 使用于获得所有方法
}
