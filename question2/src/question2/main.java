
package question2;


public class main {

    public static void main(String[] args) {
        System.out.println("Electricity power plant");
        electricity_por_plant  plant1= new electricity_por_plant();
        plant1.seteleinformation();
        plant1.setelectricityinformation();
        System.out.println("Customer");
        customer customer1= new customer();
        customer1.seteleinformation();
        customer1.setelecustomerinformation();
        customer1.type();
        customer1.totalbill(plant1.priceKB);
        System.out.println("Employees");
        employees employees1= new employees();
        employees1.seteleinformation();
        employees1.seteleemployeesinformation();
        employees1.bill(customer1.bill);
        plant1.printinformation();
        plant1.printctricityinformation();
        customer1.printcustomerinformation();
        employees1.printemployeesinformation();
        employees1.printebill();
        
    }    
}
