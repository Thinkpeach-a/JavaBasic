package org.example.fundamental;

public class InnerClassDemo {
    private int outerClassNum = 1;
    public class InnerClass{
        private int innerClassNum;
        public InnerClass(){
            // if it is not static, the class can directly access to outer variables
            this.innerClassNum = outerClassNum;
        }

    }
    public static class InnerClass2{
        private int innerClassNum;
        public InnerClass2(){
           //static class cannot initialize with the non static fields
        }
    }
    public static void main(String[] args){
        System.out.println(new InnerClassDemo().new InnerClass().innerClassNum);
    }
}
