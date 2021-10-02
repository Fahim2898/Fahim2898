
package question2;

public class employees extends superclass implements Iemployees{
private String eID,Name;
   public double Totcbill;
    @Override
    public void seteleemployeesinformation() {
        System.out.print("Employe Id:");
         eID =input.nextLine();
         System.out.print("Employe Name=");
         Name =input.nextLine();
    }

    @Override
    public void printemployeesinformation() {
        System.out.println("Employe Id: "+eID);
        System.out.println("Employe Name"+Name);
    }
    public void bill(double bill)
    {
        Totcbill   = bill;   
    }
    
    public void printebill()
    {
        System.out.println("Employe Collected Bill: "+Totcbill);
    }

     }
