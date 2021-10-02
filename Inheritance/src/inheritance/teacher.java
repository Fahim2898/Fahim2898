package inheritance;

import java.util.Scanner;
import other.Person;

public class teacher extends Person {

    Scanner input = new Scanner(System.in);
    private String salery;
    private String Coursecode;
    private int chour;

    public void teacher(String n) {
        salery = n;
    }

    void asscourse(String C, int ch) {
        Coursecode = C;
        chour = ch;
    }

    public void prininfo2() {
        System.out.println("Salery: " + salery);
        System.out.println("Coursecode = " + Coursecode);
        System.out.println("Cradet Hour = " + chour);
    }

}
