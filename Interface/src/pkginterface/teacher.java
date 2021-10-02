package pkginterface;

public class teacher implements superclass {

    String Name, Id, Salery;

    @Override
    public void setinformation() {

        System.out.print("Enter Your Name:");
        Name = input.nextLine();
        System.out.print("Enter Your Id:");
        Id = input.nextLine();
        System.out.print("Enter Your Salery:");
        Salery = input.nextLine();

    }

    @Override
    public void printinfo() {
        System.out.println("Teacher Information:");
        System.out.println("Name: " + Name);
        System.out.println("Id: " + Id);
        System.out.println("Salery: " + Salery);   
    }

}
