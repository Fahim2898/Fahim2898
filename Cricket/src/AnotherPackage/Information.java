package AnotherPackage;
import java.util.Scanner;
public class Information {
    String name;
    int age;
    int match;
    Scanner input = new Scanner(System.in);
    public void setInformation(){
        System.out.print("Enter Name = ");
        name = input.nextLine();
        System.out.print("Enter Age = ");
        age = input.nextInt();
    }
    public int total_prize(){
        int Total_prize = 0;
        System.out.print("Enter Number of Match = ");
        match = input.nextInt();
        if(match>=10 || match<=10){
        Total_prize = match * 3000;
        }
        return Total_prize;
    }
    public int Bonus(int m){
        if(match>10){
            m = m + 1000;
        }
        return m;
    }
        public void printInformation(int n,int p){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Total match = "+match);
        System.out.println("Total prize = "+n);
        if(match>10){
         System.out.println("Total prize with Bonus = "+p);
        }
    }
   }