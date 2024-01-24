package org.example;

public class Main {
    public static void main(String[] args) throws Exception{
        //首先会调用 i 是否在
        /*ExceptionExample example = new ExceptionExample();
        try {
            example.run1();
        }catch(Exception exception){
            throw new Exception("wrong main");
        }*/
        System.out.println("A");
        System.in.read();

    }
    public Main(){
        System.out.println("B");
    }
    {
        System.out.println("C");
    }
    static {
        System.out.println("D");
    }
}