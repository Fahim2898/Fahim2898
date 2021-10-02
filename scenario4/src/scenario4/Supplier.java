package scenario4;

public class Supplier implements IBonus {

    int soldItem;

    void setSoldItem(int si) {
        soldItem = si;
    }

    @Override
    public void getBonus() {
        System.out.println("Bonus is(Supplier): " + soldItem * .15);
    }

    void printSupplierSalary() {
        System.out.println("Sold Item is  : " + soldItem);
    }
}
