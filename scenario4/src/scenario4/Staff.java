package scenario4;

public class Staff extends Empolyee implements IBonus {

    Staff(int s) {

        super(s);

    }

    public void printStaffSalary() {

        System.out.println("The salary of staff : " + salary);

    }

    @Override
    public void getBonus() {
        System.out.println("Bonus is :  " + salary * .15);
    }

}
