package midood;

public class MarketingOfficers extends Officer {

    public void taxMaroff() {

        if (yearSalary > 300000) {
            tax = yearSalary * 0.15;
        }
    }

    public void MarketingOfficers() {
        System.out.println("*********Marketing Officer*********");
    }
}
