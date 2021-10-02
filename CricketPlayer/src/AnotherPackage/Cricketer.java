package AnotherPackage;
import java.util.Scanner;
public class Cricketer { 
    String name;
    String country;
    int age;
    int nRun = 6700,nWicket = 250,nMatch = 200;
    Scanner input = new Scanner(System.in);
    public void setInformation(){
        System.out.print("Enter Name = ");
        name = input.nextLine();
        System.out.print("Enter Country name = ");
        country = input.nextLine();
        System.out.print("Enter Age = ");
        age = input.nextInt();
    }
    public void IncreaseRun(int r){
        nRun = nRun + r;
    }
    public void IncreaseWicket(int w){
        nWicket = nWicket + w;
    }
    public void IncreaseMatch(int m){
        nMatch = nMatch + m;
    }
    public void PrintInformation(int r, int w, int m){
        System.out.println("Name = "+name);
        System.out.println("Country = "+country);
        System.out.println("Age = "+age);
        System.out.println("Run = "+(nRun-r));
        System.out.println("After Increase Run = "+nRun);
        System.out.println("Wicket = "+(nWicket-w));
        System.out.println("After Increase Wicket = "+nWicket);
        System.out.println("Match = "+(nMatch-m));
        System.out.println("After Increase Match = "+nMatch);
    }
}
    