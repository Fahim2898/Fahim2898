package ParentsPackage;
import java.util.Scanner;
// private, public protected
public class Person {
    protected String id;
    protected String name;
 protected Scanner input = new Scanner(System.in);
    public void setPerson(){     
        System.out.println("input id: ");
        id = input.nextLine();
        System.out.println("input name: ");
        name= input.nextLine(); // 
    }
    public void setBonus(){
     // 
    }
    public void printPerson(){
        System.out.println("id = " + id);
        System.out.println("name = "+ name);
    }
}


