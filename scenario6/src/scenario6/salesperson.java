
package scenario6;

public class salesperson extends Employee implements IDiscount {
    
    int price;
    salesperson(int s){
        super(s);
    }
   void set_price(int v){
       price = v;
   }
    @Override
    void getBonus() {
        System.out.println("Sales person salary "+salary+" and you get 15% bonus = "+(8*salary)/100+" taka"); 
    }

    @Override
    void CheckFile() {
        System.out.println("Sales person check file on swoat analysis"); 
    }

    @Override
    void MonitorActivitis() {
        System.out.println("Sales person monitors activities on employee development"); 
    }

    @Override
    public void get_discount() {
        System.out.println("Sales person get 3% Eid discount "+(3*price)/100+"taka ");  //To change body of generated methods, choose Tools | Templates.
    }
    
}

