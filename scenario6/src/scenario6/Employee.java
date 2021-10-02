package scenario6;

public abstract class Employee {

    int salary;

    Employee(int s) {
        salary = s;
    }

    abstract void getBonus();

    abstract void CheckFile();

    abstract void MonitorActivitis();
}
