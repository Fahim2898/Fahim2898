
package supershop;

import ParentsPackage.Person;

public class Customer extends Person{
    String accountType;  // inh id , name
    
    public void setCustomer(){
       System.out.println("input accountType: ");
        accountType = input.nextLine();
    }
    public void printCustomer(){
        System.out.println("accountType = " + accountType);
    }
}
