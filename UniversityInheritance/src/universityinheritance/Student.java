package universityinheritance;
public class Student extends Person{  // person is a parent   Student is a child
   String Id;
   String course_info;
   
   public void setStudentValue(){
      System.out.println("input student info:");
      Id=input.nextLine();
      course_info=input.nextLine();
   }
   
   public void print_student_info(){
       System.out.println("Id = " + Id);
       System.out.println("course_info = " + course_info);
   }
}
