package constructor;

public class Student {

    String name;
    String id;
    double cgpa;

    Student(String n, String i, double c) {
        name = n;
        id = i;
        cgpa = c;
    }

    void print() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
    }
}
