package company;

public class Officer {
    String  jobID, name, salary_information, total_working_hour, payment_per_hour, performance;
    int number=0;
    void setinformation(String j, String N)
    {
        jobID= j;
        name =N;
    }

    void printinfo( )
    {
        
        System.out.println("Job ID = "+jobID);
        System.out.println("Name = " + name);
        System.out.println("");
    }
}
