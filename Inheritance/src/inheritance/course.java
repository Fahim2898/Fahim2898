package inheritance;

import java.util.Scanner;

public class course {

    String Coursecode, title;
    int chour, tsyu;
    Scanner input = new Scanner(System.in);

    public void setcourse() {
        System.out.print("Enter Course Title: ");
        title = input.nextLine();
        System.out.print("Enter Course Code: ");
        Coursecode = input.nextLine();
        System.out.print("Enter Course Cradet Hour: ");
        chour = input.nextInt();

    }

    public void printcourse() {
        System.out.println("Course Info:");
        System.out.println("Course Title =" + title);
        System.out.println("Course Code =" + Coursecode);
        System.out.println("Course Cradet Hour =" + chour);
    }

    void assnostu() {
        tsyu =tsyu+1;
    }
    
    public void tstu() {
        System.out.println("Total Enrollstudent = " + tsyu);
    }
}
