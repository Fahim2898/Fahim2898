package aboutcricketer;
import Historyofcric.CRicketer;
import java.util.*;


public class main {

 
    public static void main(String[] args) {

        CRicketer Shakib = new CRicketer();
        int run,wicket,match;
               Scanner input = new Scanner(System.in);
        System.out.print("Enter Last Run = ");
        run = input.nextInt();
        System.out.print("Enter Last Wicket = ");
        wicket = input.nextInt();
        //System.out.print("Enter Last Match = ");
          //   match = 1;
         Shakib.increaseRun(run );
         Shakib. increaseWicket(wicket);
         Shakib. increaseMatch(1);
         Shakib. printIn();
         
    }
}