package week9;

import java.util.Scanner;

public class superclass {

    protected String roomId = "2898", id, name;
    Scanner input = new Scanner(System.in);

    void setValue() {
        System.out.println("Enter your ID = ");
        id = input.nextLine();
        System.out.println("Enter your Name = ");
        name = input.nextLine();
    }

    void printValue() {
        System.out.println("..........Welcome Sir/Mam to our Hotel..........");
        System.out.println("Your name = " + name);
        System.out.println("Your Room Id = " + roomId);
        System.out.println("Your Id = " + id);
    }

}
