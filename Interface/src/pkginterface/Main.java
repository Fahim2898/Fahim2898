package pkginterface;

public class Main {

    public static void main(String[] args) {

        superclass student1, teacher1;
        System.out.println("Student:");
        student1 = new student();
        student1.setinformation();
        System.out.println("Teacher:");
        teacher1 = new teacher();
        teacher1.setinformation();
        student1.printinfo();
        teacher1.printinfo();
    }        
    }