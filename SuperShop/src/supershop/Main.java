package supershop;
import ParentsPackage.Person;

public class Main{
    public static void main(String[] args) {
        System.out.println("For Customer:");
        Customer objCustomer = new Customer();
        objCustomer.setPerson(); // id, name
        objCustomer.setCustomer(); // customerType
        
       // Person p = new Person();
       // p.name="mustafiz";
        
        objCustomer.printPerson();
        objCustomer.printCustomer();
        
        System.out.println("For Manager:");
        Manager objManager = new Manager();
        objManager.setPerson(); // id, name
        objManager.setManager();// customerType
        
        objManager.printPerson();
        objManager.printManager();
    }
}
