package org.example.reflection;

public class ClassLoaderExample {
    public static void main(String args[]){
        ClassLoader myLoader = ClassLoader.getSystemClassLoader();
        System.out.println(myLoader);
    }

}
