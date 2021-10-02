package universityinheritance;

public class Teacher extends Person{
    private String empId;
    private double mSalary;
    
    public void setTeacherValue(){
        System.out.println("input teacher info:");
        empId=input.nextLine();
        mSalary=input.nextDouble();
    }
  
    public void printTeacherInfo(){
        
        System.out.println("empId = " + empId);
        System.out.println("mSalary = " + mSalary);
    }
}
