package project;

import java.util.Scanner;

public class Person/* implements IPerson*/ {
        String id, name, phone, age;
       /* Person(String I,String n,String p,String a)
        {
        id=I;
        name =n;
        phone=p;
        age=a;
        }*/
    Scanner input=new Scanner(System.in);

    public void printInformation() {
        System.out.println("ID= "+id);
        System.out.println("Name = " + name);
        System.out.println("Phone = " + phone);
        System.out.println("Age = " + age);
    }

    public void setInformation() {
       /* id=I;
        name =n;
        phone=p;
        age=a;*/
        System.out.print("Enter Your Id: ");
        id=input.nextLine();
        System.out.print("Enter Your Name: ");
        name=input.nextLine();
        System.out.print("Enter Your Phone: ");
        phone=input.nextLine();
        System.out.print("Enter Your Age: ");
        age=input.nextLine();
    }
}
