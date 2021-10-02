package scenario4;

public class Manager extends Empolyee implements IBonus {

    Manager(int s) {
        super(s);
    }

    @Override
    public void getBonus() {
        System.out.println("Bonus is: " + salary * .10);
    }

    public void printManagerSalary() {

        System.out.println("Salary of Manager : " + salary);

    }
    
    @Override
    void getHealthInsurance()
    {
        System.out.println("Health Insurance = " +salary*0.08);
    }
}
