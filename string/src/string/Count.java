
package string;

import java.util.*;

public class Count {

    public static void main(String[] args) {
        int Num = 0;
        char[] Element;
        char K;
        String JH;
        java.lang.String S1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Sentence:");
        S1 = input.nextLine();
        //   S1 = "MD. FAHIM BHUIYAN"
        int i = S1.length();
        for (int j = 0; j < i; j++) {
            Element = S1.toCharArray();
            K = Element[j];
            if (K == 'A') {
                Num = Num + 1;
            }
        }
        System.out.print("A: " + Num);
        System.out.println();
    }
}
