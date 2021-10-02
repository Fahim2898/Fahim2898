
package ood2;

public class main {
    public static void main(String[] args) {
        Student ali = new Student(121, 3.5, 10000);
        Student joy = new Student(122, 3.9, 12000);
        Admin al = new Admin();
       // al.waverCalculation();
        
        al.waver_calculation(ali);
        al.fee_cleareance(ali);
        al.waver_calculation(joy);       
        al.fee_cleareance(joy);
        al.spical_cleareance(ali);
        al.spical_cleareance(joy);
    }
}
