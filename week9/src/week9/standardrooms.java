package week9;

public class standardrooms extends superclass {

    int Ac;

    void Ac() {
        System.out.println("Enter Select Room Type:");
        System.out.println("1.Ac\n2.non-Ac");
        Ac = input.nextInt();
    }

    void printroom() {
        switch (Ac) {
            case 1:
                System.out.println("your Room Type = Ac");
                break;
            case 2:
                System.out.println("your Room Type = Non-Ac");
                break;
            default:
                System.out.println("You select Wrong Keyword ");
                break;
        }
    }
}
