package scenario4;

public class Main {

    public static void main(String[] args) {
        Manager m1 = new Manager(100000);
        Staff s1 = new Staff(75000);
        Supplier s2 = new Supplier();
        m1.printManagerSalary();
        m1.getBonus();
        s1.printStaffSalary();
        s1.getBonus();
        s2.setSoldItem(10000);
        s2.printSupplierSalary();
        s2.getBonus();

    }

}
