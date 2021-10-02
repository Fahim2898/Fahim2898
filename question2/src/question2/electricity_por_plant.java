
package question2;

public class electricity_por_plant extends superclass implements Ielectricity_power_plant {

    String location;
    String totcap;
   public String procostpMW,Nconsumers;
  public int priceKB;
    @Override
    public void setelectricityinformation() {
        System.out.print("Location=");
        location =input.nextLine();
        System.out.print("Total power capacity(MW)=");
        totcap =input.nextLine();
        System.out.print("Production cost per MW=");
        procostpMW =input.nextLine();
        System.out.print("Total number of consumer=");
        Nconsumers =input.nextLine();              
    }
    public int kilowatt(){
        System.out.print("Price of one Kilowatt(KB)=");
        priceKB =input.nextInt();
        return priceKB;
    }
 
    @Override
    public void printctricityinformation() {
        System.out.print("Location: "+location);
        
    }    
}
