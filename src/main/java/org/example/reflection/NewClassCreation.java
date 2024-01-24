package org.example.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class NewClassCreation {
    public static void main(String args[]){
        Class cl;
        try {
            cl = Class.forName("org.example.reflection.Person");
            Constructor constructor = cl.getDeclaredConstructor(String.class);
            Person person = (Person)constructor.newInstance("Yida");
            Method gettoString = cl.getDeclaredMethod("toString");
            gettoString.invoke(person);

        }catch (Exception exception){
            exception.printStackTrace();
        }

    }
}
