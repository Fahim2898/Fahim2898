package person;
import java.util.Scanner;
public class SalesMan {
    String eId;
    String name;
    double salary;
    final double dSalary=1000;
     Scanner input = new Scanner(System.in);
    void setValue()
    {
        System.out.println("Inter Employee ID:");
        eId = input.nextLine();
        
        System.out.println("Inter Employee Name:");
        name = input.nextLine();
    }    
      double mSalaryCalculate(){
        salary =dSalary*30;
        return salary;           
       }      
      void calculatebonus(int nofProductAvg)
      {
          double monthlyb=0;
          if(nofProductAvg>100)
          {
             monthlyb=500*30;              
          }
          System.out.println("MonthlyBonus = "+monthlyb);        
      }
}
