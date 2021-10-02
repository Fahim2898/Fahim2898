
package cricketplayer;
import java.util.Scanner;
import AnotherPackage.Cricketer;

public class Controller {

    public static void main(String[] args) { 
       Cricketer Shakib = new Cricketer();
       Scanner input = new Scanner(System.in);
        int run,wicket,match;
        Shakib.setInformation();
        System.out.print("Enter Last Run = ");
        run = input.nextInt();
        System.out.print("Enter Last Wicket = ");
        wicket = input.nextInt();
        //System.out.print("Enter Last Match = ");
        match = 1;
        Shakib.IncreaseRun(run);
        Shakib.IncreaseWicket(wicket);
        Shakib.IncreaseMatch(match);
        Shakib.PrintInformation(run,wicket,match);
    }
    }        
   

