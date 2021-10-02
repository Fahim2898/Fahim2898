
package Salary_System;

import java.util.Scanner;

public class Officer {
    String name, id, salary,perfomance;
         double   paymentperhour,totalworkhour,monthlySalary,yearSalary,bounus;

    Scanner input = new Scanner(System.in);

    public void setInformation( String I,String N,double Wh, double py,String P) {
        
        id=I;
        name=N;
        totalworkhour =Wh;
        paymentperhour = py;
        perfomance =P;
    }
    
    
    public void monthlySalary()
    {
        monthlySalary=totalworkhour *paymentperhour;
    }
    
    public void festivalbounus()
    {
      bounus = monthlySalary*2;
    }
    public void yearSalary()
    {
        yearSalary=(12*monthlySalary)+bounus;
    }
    public void printinfo()
    {
        System.out.println("Id= "+id);
        System.out.println("Name= "+name);
        System.out.println("Working Hours= "+totalworkhour);
        System.out.println("Per Hour Selery "+paymentperhour);
        System.out.println("Prefomance= "+perfomance);
        System.out.println("Print Monthly Salary= "+monthlySalary);
    }
    
    public void printyearlyselery()
    {
        System.out.println("Print Yearly Salary= "+yearSalary);
    }
    
}
