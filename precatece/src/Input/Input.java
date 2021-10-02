
package Input;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String Name;
        System.out.print("Name=");
        Scanner input = new Scanner(System.in);
        Name = input.nextLine();
        System.out.println("Name: "+Name);
    }
}
