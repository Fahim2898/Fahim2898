package gpa;
import java.util.Scanner;
public class GPA {
    public static void main(String[] args) {
        System.out.println("Welcome Our Java GPA System");
        System.out.println("---------------------------");
        int marks;
                Scanner input = new Scanner(System.in);
                System.out.print("Input Your Marks:");
                    marks = input.nextInt();
                    System.out.print("Your GPA:");
                    if(marks>100)
                    {
                        System.out.println("Invalid Marks");
                    }
                    else if(marks>=80)
                    {
                        System.out.println("A+");
                    }
                    else if(marks>=75)
                    {
                        System.out.println("A");
                    }
                    else if(marks>=70)
                    {
                        System.out.println("A-");
                    }
                    else if(marks>=65)
                    {
                        System.out.println("B+");
                    }
                    else if(marks>=60)
                    {
                        System.out.println("B");
                    }
                    else if(marks>=55)
                    {
                        System.out.println("B-");
                    }
                    else if(marks>=50)
                    {
                        System.out.println("C+");
                    }
                    else if(marks>=45)
                    {
                        System.out.println("C");
                    }
                    else if(marks>=40)
                    {
                        System.out.println("D");
                    }
                    else if(marks<40 && marks>=0)
                    {
                        System.out.println("Fail");
                    }
                    else
                    {
                        System.out.println("Invalid Marks");
                    }
    }  
}
