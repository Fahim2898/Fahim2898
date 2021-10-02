package ood1;

public class Main {

    public static void main(String[] args) {

        Employee ali = new Employee(12, 8, "d");
        Employee joy = new Employee(24, 7, "d");
        Employee mim = new Employee(22, 9, "d");

        System.out.println(ali.emp_id);
        System.out.println(ali.working_hour);
        System.out.println(ali.shift);
        System.out.println(joy.emp_id);
        System.out.println(joy.working_hour);
        System.out.println(joy.shift);
        System.out.println(mim.emp_id);
        System.out.println(mim.working_hour);
        System.out.println(mim.shift);

    }

}
