package fahim;

import java.util.Scanner;

public class Fahim {
    String Name,Id;
    int Age,Phone;
    
    void Setinfo()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        Name =input.nextLine();
        System.out.println("Enter Your ID:");
        Id =input.nextLine();
        System.out.println("Enter Your Age:");
        Age =input.nextInt();
        System.out.println("Enter Your Phone Number:");
        Phone =input.nextInt();        
    }
    void printinfo()
    {
        System.out.println("Name: "+Name);
        System.out.println("Id:"+Id);
        System.out.println("Age:"+Age);
        System.out.println("Phone Number:"+Phone);
    }
}


