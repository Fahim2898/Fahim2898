package hrrn;

import java.util.Scanner;

public class HRRN {

    public static void main(String[] args) {
        System.out.println("HRRN");
        int i, k, at,st;
        Scanner input = new Scanner(System.in);
        System.out.print("Input The number of set:");
        k = input.nextInt();
        for (i = 1; i <= k; i++) {
            System.out.print("Input Your AT(" + i + "):");
            at = input.nextInt();
            System.out.print("Input Your ST(" + i + "):");
            st = input.nextInt();
        }
    }

}
