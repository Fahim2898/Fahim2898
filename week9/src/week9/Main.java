package week9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        deluxerooms room = new deluxerooms();
        standardrooms Room = new standardrooms();
        Scanner input = new Scanner(System.in);
        System.out.print("Pleace Select 1 for Deluxe Room or 2 for Standerd Room:");
        int a = input.nextInt();
        switch (a) {
            case 1:
                room.setValue();
                room.RoomSize();
                room.printValue();
                room.printsize();
                break;
            case 2:
                Room.setValue();
                Room.Ac();
                Room.printValue();
                Room.printroom();
                break;
            default:
                System.out.println("Sorry Sir/Mam You Select Wrong Batton.");
                break;
        }
    }
}
