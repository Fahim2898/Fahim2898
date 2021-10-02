package cricketerinfo;
import java.util.Scanner;
public class Controller {

    public static void main(String[] args) {
       
        int run,wicket,match;
        Scanner input = new Scanner(System.in);
        Cricketerinfo cricketer1 = new Cricketerinfo();
        cricketer1.setInformation();
        System.out.println("Enter his last run = ");
        run = input.nextInt();
        cricketer1.IncreseRun(run);
        System.out.println("Enter his last Wicket = ");
        wicket = input.nextInt();
        cricketer1.IncreseWicket(wicket);
        System.out.println("Enter his Match = ");
        match = input.nextInt();
        cricketer1.IncreseMatch(match);
        cricketer1.DisplayInformation();
    }
}
