package project;

public  class Student extends Person /*implements IStudent */{
    String courseName,courseCode;
    double cgpa,credit,tuitionFee=4000,totaltuitionFee;//Per credit Tuition Fee is 4000BDT
    /*public Student(/*String I, String n, String p, String a) {
        
      //  super(I, n, p, a);
        System.out.println("*********Student's Information*********");
    }*/
    
    public void studentinfo(double c) {
        cgpa= c;
    }

    public void studentassignCourse(String CC, String CN, double cit) {
      courseCode=CC;
      courseName=CN;
      credit=cit;
    }
    public void tuitionFee()
    {
        totaltuitionFee=tuitionFee*credit;
    }
    public void printstudentinfo() {
        System.out.println("CGPA = " + cgpa);
        
    }

    public void printstudentcourseinfo()
    {
        System.out.println("Course Code = " + courseCode);
        System.out.println("Course Name = " + courseName);
        System.out.println("Credit Houre= " + credit);
        System.out.println("Total Tuition Fee  = " + totaltuitionFee);
    }
    
}
