package org.example.fundamental;

import java.io.*;

public class SerializationDemo {
    // 如果是父类构造器没有序列化，那么父类变量会保持初始值
    // 如果是static 修饰的值， 则从文件中读取的数据不会影响原来的static值
    // 如果需要加密，那么可以重写writeObject ReadObject 方法
    // https://juejin.cn/post/6973664796709404708
    public static void main(String[] args) {
        Student student = new Student(1, "xiaoming");
        try {
            FileOutputStream file = new FileOutputStream("temp.txt");
            ObjectOutputStream obj = new ObjectOutputStream(file);
            obj.writeObject(student);
            obj.flush();
            obj.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream inputFile = new FileInputStream("temp.txt");
            ObjectInputStream objectStream = new ObjectInputStream(inputFile);
            Student student1 = (Student) objectStream.readObject();
            System.out.println("studentId: " + student1.getId());
            System.out.println("studentName: " + student1.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Student implements Serializable{
    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public Student(int id, String name){
        this.name = name;
        this.Id = id;
    }

}