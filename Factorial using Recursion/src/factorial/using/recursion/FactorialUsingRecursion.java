package factorial.using.recursion;

import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        int i;
        System.out.print("Enter Number for Factorial:");
        Scanner input = new Scanner(System.in);
        int Number, Factorial = 1;
        Number = input.nextInt();
        for (i = 1; i <= Number; i++) {
            Factorial = Factorial * i;
        }
        System.out.println("Factorial of " + Number + " is: " + Factorial);
    }
}
