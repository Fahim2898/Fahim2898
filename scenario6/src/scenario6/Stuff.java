
package scenario6;

public class Stuff extends Employee implements IDiscount {
    
    int price;
    Stuff(int s){
        super(s);
    }
    void set_price(int a){
        price = a;
    }
    @Override
    void getBonus() {
        System.out.println("Stuff salary "+salary+" and you get 15% bonus = "+(10*salary)/100+" taka"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void CheckFile() {
        System.out.println("Stuff check on risk management file"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void MonitorActivitis() {
        System.out.println("Stuff monitors activities on website development"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void get_discount() {
        
        System.out.println("Stuff get 5% Eid discount "+(5*price)/100+"taka "); //To change body of generated methods, choose Tools | Templates.
    }
    
}



