package inheritance;

import java.util.Scanner;
import other.*;

public class student extends Person {

    String cgpa, Coursec;
    Scanner input = new Scanner(System.in);

    public void student() {
        System.out.print("Enter CGPA= ");
        cgpa = input.nextLine();
    }

    void asscourse(String Coursecode) {
        Coursec = Coursecode;
    }

    public void prininfo1() {
        System.out.println("CGPA: " + cgpa);
        System.out.println("Course Code :" + Coursec);
    }
}
