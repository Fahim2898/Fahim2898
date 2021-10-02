package supershop;

import ParentsPackage.Person;

public class Manager extends Person{
    double salary;
    public void setManager(){
     System.out.println("input salary: ");
     salary = input.nextDouble();
     
     
    }
    public void printManager(){
        System.out.println("salary = " + salary);
        System.out.println("name = " + name);
    }
}
