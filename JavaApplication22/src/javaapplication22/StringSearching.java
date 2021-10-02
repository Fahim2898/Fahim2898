
package javaapplication22;

import java.util.Scanner;

public class StringSearching {

    public static void main(String[] args) {
        String m;
        char[] a = new char[100];
        int b = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String = ");
        m = input.nextLine();
        int i = m.length();
        a = m.toCharArray();
        System.out.println(a);
        for (int j = 0; j < i; j++) {
            if (a[j] == 'a' || a[j] == 'A') {
                b = b + 1;
            }
        }
        System.out.println("Here A have = " + b);

    }

}
