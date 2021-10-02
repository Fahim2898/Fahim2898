
package ood3;


public class Employee {
    int emp_id;
    int working_hour;
    String shift;

    Employee(int e, int v, String s)
    {
        emp_id= e;
        working_hour =v;
        shift = s;
    }
          void check_document_ststud(Document d1 )
          {
              if(d1.status=="Done")
                  System.out.println("We can deal");
              else if (d1.status.equals("Done"))
                  System.out.println("Proceed");
              
          }
    
}
