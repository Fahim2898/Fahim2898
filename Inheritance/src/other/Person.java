package other;

import java.util.Scanner;

public class Person {

    String name, Id, phone;

    Scanner input = new Scanner(System.in);

    public void setInformation() {
        System.out.print("Enter Name = ");
        name = input.nextLine();
        System.out.print("Enter Id = ");
        Id = input.nextLine();
        System.out.print("Enter Phone = ");
        phone = input.nextLine();
    }

    public void prininfo() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + Id);
        System.out.println("Phone: " + phone);
    }
}
