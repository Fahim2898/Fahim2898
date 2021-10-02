
package scenario6;

public class Manager extends Employee{
    
Manager (int s){
        super(s);
    }

    @Override
    void getBonus() {
         System.out.println("Manager salary "+salary+" and you get 15% bonus = "+(15*salary)/100+" taka ");
    }

    @Override
    void CheckFile() {
         System.out.println("Manager check on  system construction file");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void MonitorActivitis() {
         System.out.println("Manager monitors activities on company development");//To change body of generated methods, choose Tools | Templates.
    }
    
}

