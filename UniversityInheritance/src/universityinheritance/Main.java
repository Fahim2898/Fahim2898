package universityinheritance;

public class Main {
public static void main(String[] args) {
    System.out.println("enter student info:");
    Student std1 = new Student();
    std1.SetPersonValue();
    std1.setStudentValue();
    
    std1.printPerson();
    std1.print_student_info();
    
    System.out.println("enter Teacher info:");
    Teacher tea= new Teacher();
    tea.SetPersonValue();
    tea.setTeacherValue();
    
    tea.printPerson();
    tea.printTeacherInfo();
    
  }  
}
