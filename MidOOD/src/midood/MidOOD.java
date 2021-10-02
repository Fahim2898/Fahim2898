
package midood;

public class MidOOD {

    public static void main(String[] args) {
        {
            FinenciaOfficers ali = new FinenciaOfficers();
            ali.FinenciaOfficers();
            ali.setInformation("S101", "Ali Khan", 300, 120, "Good");
            ali.monthlySalary();
            ali.yearSalaryfin();
            ali.printinfo();
            ali.festivalbounusFinenciaOfficers(300, 120);
            ali.texfinoff();
            ali.printyearlyselery();
            ali.printtax();
            ali.aftertax();
            MarketingOfficers joy = new MarketingOfficers();
            joy.setInformation("S102", "Joy Ahamad", 270, 115, "Good");
            joy.MarketingOfficers();
            joy.monthlySalary();
            joy.yearSalarymar();
            joy.printinfo();
            joy.taxMaroff();
            joy.printyearlyselery();
            joy.printtax();
            joy.aftertax();
        }
    }

    
}
