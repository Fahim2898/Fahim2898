
package scenario6;

public class Customer implements IDiscount {

    int price;
    Customer(int p){
        price = p;
    }    
    @Override
    public void get_discount() {
        System.out.println("Customer get 10% Eid discount "+(10*price)/100+"taka "); //To change body of generated methods, choose Tools | Templates.
    }
    
}


