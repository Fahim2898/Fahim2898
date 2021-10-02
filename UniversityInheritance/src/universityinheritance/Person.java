package universityinheritance;

import java.util.Scanner;
// supper class
public class Person {
    protected String fName;
    protected String lName;
    protected String dept;
    protected int age;
    public Scanner input=new Scanner(System.in);

    public void SetPersonValue(){
        System.out.println("input person info: ");
         System.out.println("input fName: ");
        fName=input.nextLine();
          System.out.println("input lName: ");
        lName=input.nextLine();
        System.out.println("input dept: ");
        dept=input.nextLine();
        System.out.println("input age: ");
//        age=input.nextInt();
        input.nextLine();
    }
    public void printPerson(){
        System.out.println("fName = " + fName);
        System.out.println("lName = " + lName);
        System.out.println("dept = " + dept);
        System.out.println("age = " + age);
    }
    
}
