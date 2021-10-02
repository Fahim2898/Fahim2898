
package has;

public class Student {
    String id;

    Course c1;
    Student(String i)
    {
        id=i;
    }
    void registrarion(Course c)
    {
        c1=c;
    }
    void printCourse()
    {
        System.out.println(id+ ""+c1.code);
    }
}
