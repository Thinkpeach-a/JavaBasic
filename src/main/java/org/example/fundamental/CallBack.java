package org.example.fundamental;

public class CallBack {
    public static void main(String[] args){
        A a = new A();
        a.inform();
    }
}
interface Friends{
    public void play();

}

class A implements Friends{
    @Override
    public void play() {
        System.out.println("Let's play together");
    }
    public void inform(){
        B b = new B();
        b.getUp(this);
    }
}

class B {
    public void getUp(Friends friend){
        System.out.println("wake up");
        friend.play();
    }
}