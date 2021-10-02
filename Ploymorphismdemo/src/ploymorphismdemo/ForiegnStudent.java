package ploymorphismdemo;

public class ForiegnStudent extends Student {

    ForiegnStudent(double c) {
        super(c);
    }
    @Override
    void paymentPerSemester()
    {
        System.out.println("45000BDT");
    }
}
