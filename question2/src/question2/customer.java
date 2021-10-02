
package question2;


public class customer extends superclass implements Icoustomer{
    private String id,name,location;
    public int MUKW;
    private int i;
    public double type,n,t,dis,ser,bill;
    @Override
    public void setelecustomerinformation() {
        
        System.out.print("Customer Name=");
        name =input.nextLine();
        System.out.print("Id=");
        id =input.nextLine();
        System.out.print("Location=");
        location =input.nextLine();
        System.out.print("monthly used power unit in KW=");
        MUKW =input.nextInt();       
    }
    public void type()
    {
        System.out.println("Select Your Using Type:\n1.Monthly User\n2.Yearly User");
        i = input.nextInt();
        switch (i) {
            case 1:
                type=0.03;
                break;
            case 2:
                type=0.02;
                break;
            default:
                System.out.println("Wrong Value Input");
                break;
        }
    }
    public void totalbill(int k)
    {
        int price =k;
        if (MUKW>100)
        {
            n=MUKW*price;
            t=n*0.04;
            dis=n*0.02;
            ser=n*type;
            bill=n+t+ser-dis;
        }   
        else
        {
            n=MUKW*price;
            t=n*0.04;
            ser=n*type;
            bill=n+t+ser;
        }   
        
    }
    @Override
    public void printcustomerinformation() {
        System.out.println("Customer:");
        System.out.println("Customer Name: "+name);
        System.out.println("id: " + id);
        System.out.println("Bill: "+bill);        
    }
    
}
