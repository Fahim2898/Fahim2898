
package midood;

public class FinenciaOfficers extends Officer {

    double festivalbounus;

    public void FinenciaOfficers() {
        System.out.println("*********Finencia Officer*********");
    }

    public void festivalbounusFinenciaOfficers(double Wh, double ms) {
        festivalbounus = Wh * ms * 2;

        System.out.println("Finencia Officers festival bounus: " + festivalbounus);
    }

    public void texfinoff() {
        if (yearSalary > 250000) {
            tax = yearSalary * 0.1;
        }
    }
}
