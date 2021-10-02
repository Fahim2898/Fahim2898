package scenario4;

public class Empolyee {

    int salary;

    Empolyee(int s) {
        salary = s;
    }
    void getHealthInsurance()
    {
        System.out.println("Health Insurance = " +salary*0.05);
    }
    void getHealthInsurance(Boolean A)
    {
           System.out.println("300000BDT for Road Accident");       
    }
}
