
package Salary_System;

import Salary_System.Officer;
import Salary_System.Officer;

public class MarketingOfficers extends Officer{
   
    double tex;
    
    public void texMaroff()
    {
        if(yearSalary>300000)
        tex=yearSalary*0.15;  
        
    }
    public void printtex()
    {
        System.out.println("Tex= "+tex);
    }
    
}
