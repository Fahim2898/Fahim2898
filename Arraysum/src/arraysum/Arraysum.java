package arraysum;
import java.util.Scanner;
public class Arraysum {
    public static void main(String[] args) {
         int i,sum = 0;
     Scanner input = new Scanner(System.in);
    int arr[] = new int[5];
        System.out.println("Enter Your Element:");
    for(i=0;i<5;i++)
    {
    arr[i] = input.nextInt();
    sum = sum+arr[i];
    }
        System.out.println("Your Value:");
    System.out.printf("%d\t",sum);
        System.out.println("");
    }   
}