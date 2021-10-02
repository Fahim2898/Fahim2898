package scenario1ood;

public class Empleyee {

    int emp_id;
    int working_hour;
    String shift;

    Empleyee(int e, int wh, String s) {
        emp_id = e;
        working_hour = wh;
        shift = s;
    }

    void check_document_status() {

    }

    void printinfo() {
        System.out.println("Empleyee Id=" + emp_id);
        System.out.println("Working Hour=" + working_hour);
        System.out.println("Shift=" + shift);
        System.out.println("************************");
    }
}
