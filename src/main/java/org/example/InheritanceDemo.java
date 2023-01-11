package org.example;

class A {
    int x = 20;
    public void display(){
        System.out.println("A.display");
    }
}
class B extends A {
    int x = 30;
    int y =50;
    public void display(){
        System.out.println("B.display");
    }

    public void other(){
        System.out.println("B.other");
    }
}
public class InheritanceDemo {
    public static void main(String[] args)
    {


        // Methods behavior
//         B b = new B();
//         b.display();
//         A a = new B();
//         a.display(); // B's display method is called because from bottom to top, if method not present searches in top level
//            A a2 = new A();
//            a2.display();

        // Instance variables behavior
//        B b = new B();
//        System.out.println(b.x);
//        A a = new A();
//        System.out.println(a.x);
        A a2 = new B();
        System.out.println(a2.x);
        //System.out.println(a2.y);// Invalid
        //a2.other(); Invalid, only common methods present in Parent & Child can be accessed
    }
}


