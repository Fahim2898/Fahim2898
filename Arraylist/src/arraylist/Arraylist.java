package arraylist;

import java.util.*;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> Number = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int j, i;
        System.out.println("Enter 5 Element:");
        for (i = 0; i < 5; i++) {
            j = input.nextInt();
            Number.add(j);
        }
        System.out.println("Before Sort:");
        System.out.println(Number);
        Collections.sort(Number);
        System.out.println("Sort Element:");
        System.out.println(Number);

        java.lang.String S1 = "Fahim";
        int leg = S1.length();
        System.out.println(leg);
        boolean con = S1.contains("im");
        System.out.println(con);
    }
}
