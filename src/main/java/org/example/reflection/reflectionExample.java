package org.example.reflection;

public class reflectionExample {
    public static void main(String args[]){
        // 通过类获得类对象
        Class cl = Person.class;
        System.out.println(cl);
        //通过实例获得对象
        Person person = new Person("yida");
        Class cl1 = person.getClass();
        // 通过包名
        try {
            Class cl2 = Class.forName("org.example.reflection.Person");
        }catch (Exception e){
            e.printStackTrace();
        }
        // 类对象的主动引用
        // 在反射或者new 出一个新对象的时候才会进行主动引用
        // 在调用静态方法的时候是被动引用
    }

}
class Person{
    String name;
    public Person(String name){
        this.name = name;
    }
}

class Student extends Person{
    public Student(String name){
        super(name);
    }
}