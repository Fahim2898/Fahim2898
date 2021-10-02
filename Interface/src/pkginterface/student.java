package pkginterface;

public class student implements superclass {

    String Name, Id, Cgpa;

    @Override
    public void setinformation() {

        System.out.print("Enter Your Name:");
        Name = input.nextLine();
        System.out.print("Enter Your Id:");
        Id = input.nextLine();
        System.out.print("Enter Your CGPA:");
        Cgpa = input.nextLine();
        //return null;
    }

    @Override
    public void printinfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + Name);
        System.out.println("Id: " + Id);
        System.out.println("CGPA: " + Cgpa);
    }
}
