import java.io.*;
public class Inherit extends Child {
    void method1() {
        System.out.println("This is parent class");
    }
    public static void main(String[] args) {
        Inherit obj = new Inherit();
        Child obj2 = new Child();
        obj.method1();
        obj2.method2();
        obj.method2();
    }
}

class Child {
    void method2()
    {
        System.out.println("This is child class");
    }
}