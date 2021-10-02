
package ood2;

public class Admin {
  /* public void waverCalculation() {
       double cgpa=3.9;
    if(cgpa>3.8)
    {
        System.out.println("You Got 20% Waver");
    }
   }*/
    void waver_calculation(Student s1)
    {
        if(s1.cgpa>=3.8)
            System.out.println("You got 20% Waver");
        else 
            System.out.println("No Waiver");
    }
    // write a matrod where admin check student fee student will get
    // cleareance prement more then 10000
    void fee_cleareance(Student s1 )
    {
        if(s1.fee>=10001)
            System.out.println("You got cleareance");
        else 
            System.out.println("You don't got cleareance");
    }
     void spical_cleareance(Student s1 )
    {
        if(s1.id==121 && s1.fee>=5001)
            System.out.println("You got cleareance");
        else 
            System.out.println("You don't got cleareance");
    }
    
            
   }

