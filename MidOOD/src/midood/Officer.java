
package midood;

import java.util.Scanner;

public class Officer {

    private String name, id, salary, perfomance;
    double paymentperhour;
    double totalworkhour;
    double monthlySalary;
    private double bounus, aftertax;
    public double tax, yearSalary;
    Scanner input = new Scanner(System.in);

    public void setInformation(String I, String N, double Wh, double py, String P) {

        id = I;
        name = N;
        totalworkhour = Wh;
        paymentperhour = py;
        perfomance = P;
    }

    public void monthlySalary() {
        monthlySalary = totalworkhour * paymentperhour;
    }

    public void festivalbounus() {
        bounus = monthlySalary * 2;
    }

    public void yearSalaryfin() {
        yearSalary = (12 * monthlySalary) + bounus;
    }

    public void yearSalarymar() {
        yearSalary = (12 * monthlySalary);
    }

    public void printinfo() {
        System.out.println("Id= " + id);
        System.out.println("Name= " + name);
        System.out.println("Working Hours= " + totalworkhour);
        System.out.println("Per Hour Selery " + paymentperhour);
        System.out.println("Prefomance= " + perfomance);
        System.out.println("Print Monthly Salary= " + monthlySalary);
    }

    public void printyearlyselery() {
        System.out.println("Print Yearly Salary= " + yearSalary);
    }

    public void printtax() {
        System.out.println("Tax= " + tax);
    }

    public void aftertax() {
        aftertax = yearSalary - tax;
        System.out.println("Yearly Salary After Pay Tax= " + aftertax);
    }
}
