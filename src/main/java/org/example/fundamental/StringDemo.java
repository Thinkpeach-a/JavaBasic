package org.example.fundamental;

public class StringDemo {
    public static void main(String[] args){
        String a = "aa";
        String b = "a" + "a";
        String c = new String("aa");
        System.out.println(a == b);
        System.out.println(a == c);
        // String intern:
        // it is used to put the String object into the constant pool in the heap
        //https://www.javatpoint.com/java-string-intern
        String d = new String("aaa").intern();
        String e = new String("aaa").intern();
        System.out.println(e == d);
        //String buffer and String builder
        //StringBuffer is a thread safe method, but the speed is low
        StringBuffer buffer = new StringBuffer();
        StringBuilder builder = new StringBuilder();
    }
}
