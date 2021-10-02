package question4;

import java.util.Scanner;

public class Employee {

    String EmployeeID;
    int mNumber, weekhour = 40;
    double Semployeewe = 15000;
    double otsalary, total;
    double hsalary;
    Scanner input = new Scanner(System.in);

    public void setInformation() {
        System.out.print("Enter Employee ID :");
        EmployeeID = input.nextLine();
        System.out.print("Enter Mobile Number: ");
        mNumber = input.nextInt();
    }

    public double hoursalary() {

        hsalary = (Semployeewe / weekhour);
        return hsalary;
    }

    public void overtime(int othour) {

        otsalary = (hsalary + (hsalary * .30)) * othour;
    }

    public void printinfo() {

        System.out.println("Employee ID :  " + EmployeeID);
        System.out.println("Mobile Number: " + mNumber);
        System.out.println("Salary week " + Semployeewe);
        System.out.println("Salary per Hour " + hsalary);
        System.out.println("Over Time Salary" + otsalary);
        System.out.println("Total Salary(With Overtime) " + (otsalary + Semployeewe));
    }
}

    
    

