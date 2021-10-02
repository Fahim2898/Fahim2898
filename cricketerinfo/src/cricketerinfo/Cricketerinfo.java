package cricketerinfo;

import java.util.Scanner;

public class Cricketerinfo {
    
    String name,country;
    int age,nRun,nWicket,nMatch;
    Scanner input = new Scanner(System.in);
    void setInformation(){
        System.out.println("Enter the name = ");
        name = input.nextLine();
        System.out.println("Enter your Country name = ");
        country = input.nextLine();
        System.out.println("Enter your age = ");
        age = input.nextInt();
        System.out.println("Enter his run = ");
        nRun = input.nextInt();
        System.out.println("Enter his Wicket = ");
        nWicket = input.nextInt();
        System.out.println("Enter his Match = ");
        nMatch = input.nextInt();
    }
    void IncreseRun(int r){
        nRun=nRun +r;
    }
    void IncreseWicket(int w){
        nWicket+=w;
    }
    void IncreseMatch(int m){
        nMatch+=m;
    }
    void DisplayInformation(){
        System.out.println("Name = "+name);
        System.out.println("Country = "+country);
        System.out.println("Age = "+age);
        System.out.println("Increse Run = "+nRun);
        System.out.println("Increse Wicket = "+nWicket);
        System.out.println("Increse Match = "+nMatch);
    }
}