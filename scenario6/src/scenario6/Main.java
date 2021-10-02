
package scenario6;

public class Main {

    
    public static void main(String[] args) {
         Manager m1 = new Manager(50000);
        Stuff s1 = new Stuff(25000);
        salesperson s2= new salesperson(15000);
        Customer c1 = new Customer(1000);
        m1.getBonus();
        s1.getBonus();
        s2.getBonus();
        m1.MonitorActivitis();
        s1.CheckFile();
        s2.CheckFile();
        c1.get_discount();
        s1.set_price(1000);
        s1.get_discount();
        s2.set_price(500);
        s2.get_discount();
        m1.MonitorActivitis();
        s1.MonitorActivitis();
        s2.MonitorActivitis();

    }
    
}
