
package AnotherPackage;
import java.util.Scanner;
import question4.Employee;

public class Main {

    public static void main(String[] args) {
        Employee Employee1 = new Employee();
        Scanner input = new Scanner(System.in);
        Employee1.setInformation();
        System.out.println("Enter total Over time:");
        int othour = input.nextInt();
        Employee1.hoursalary();
        Employee1.overtime(othour);
        Employee1.printinfo();
    }
}



