
package question2;

import java.util.Scanner;


public class superclass implements Isuperclass{
    String namePP;

    Scanner input = new Scanner(System.in);
    @Override
    public void seteleinformation() {
        System.out.print("Enter Poewr Plant Name = ");
        namePP = input.nextLine();
        
    }

    @Override
    public void printinformation() {
       System.out.println("Name of Power Point: " + namePP);
    }
}
