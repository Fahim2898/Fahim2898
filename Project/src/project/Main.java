package project;



public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome To My Project");
        System.out.println("");
       
         /*   Student S1 = new Student("193-35-2898", "Md. Fahim Bhuiyan", "01517328176", "19");
            S1.studentinfo(3.80);
            S1.studentassignCourse("SE221", "Object Oriented Design", 3.0);
            S1.printInformation();
            S1.tuitionFee();
            S1.printstudentinfo();
            S1.printstudentcourseinfo();*/
               for(int i=1;i<5;i++)
               {
                   Student s =new Student();
                   s.setInformation();
                   s.studentinfo(3.80);
            s.studentassignCourse("SE221", "Object Oriented Design", 3.0);
            s.printInformation();
            s.tuitionFee();
            s.printstudentinfo();
            s.printstudentcourseinfo();
                   
               }
                   
                   
               
        

    }

}

