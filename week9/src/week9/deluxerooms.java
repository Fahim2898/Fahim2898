package week9;

public class deluxerooms extends superclass {

    protected String size;
    int roomsize;

    void RoomSize() {
        System.out.println("Enter Select Room Size:");
        System.out.println("1.Small\n2.Maddiam\n3.Large");
        roomsize = input.nextInt();
    }

    void printsize() {
        switch (roomsize) {
            case 1:
                System.out.println("your Room Size = Small");
                break;
            case 2:
                System.out.println("your Room Size = Middiam");
                break;
            case 3:
                System.out.println("your Room Size = Large");
                break;
            default:
                System.out.println("You select Wrong Keyword ");
                break;
        }

    }
}
