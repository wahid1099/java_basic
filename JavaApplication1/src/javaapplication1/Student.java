package javaapplication1;

import java.util.Scanner;

import newpackage2.A;

public class Student {

    public static void main(String[] args) {
//       1. using simple method
        System.out.println("From simple method:MD WAHID");

        //3.         using same class and object creation
        Student st = new Student();

        st.display();
//       2. using sub method
//        display();

//   type 4: using different class in same package and object creation
        NewClass nm = new NewClass();
        nm.printNmae();

//        type 5: using different class in different package and object creation
        A obj = new A();
        obj.printNmae();

//      type 6: using inheritance with value assigning 
        Child obj2 = new Child();
        obj2.printmyname();

//        type 7: using inheritance with Scanner and parameter pass
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();

        obj2.myname(name);

        obj2.myname(name);

        

    }

    void display() {
        System.out.println("using sub method: MD WAHID");
    }

    static void display(){
          System.out.println("MD WAHID");
        
    }
}

class Parent {

    void printmyname() {
        System.out.println("using inheritance with value assigning :MD wahid");
    }

    void myname(String Name) {
        System.out.println("Printing from  inheritance with Scanner and parameter pass " + Name);
    }

}

class Child extends Parent {

    @Override
    public void myname(String Name) {
        System.out.println("Student Name: " + Name);
    }

}
