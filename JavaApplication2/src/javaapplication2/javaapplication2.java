package javaapplication2;
import java.util.Scanner;
import java.util.Arrays;
public class javaapplication2  {
    public static void main(String[] args) {
        
        int num[] = new int[5];
        int search,i,count1 = 0, count2 = 0,min = 0, max = 4, mid;
        Scanner input = new Scanner(System.in);
        
        System.out.println("This is a operation of Linear Search ");
        System.out.println("Enter five value = ");
        for (i = 0; i < 5; i++) {
            num[i] = input.nextInt();
        }
        System.out.print("Enter your Search valu = ");
        search = input.nextInt();
        for (i = 0; i < 5; i++) {
            if(search == num[i]){
                System.out.printf("Your search number %d and index %d",num[i],i+1);
                break;
        }
            count1 = count1+1;
        }
        
        System.out.printf("\n This is a operation of Binary Search\n");
        Arrays.sort(num);
        System.out.println("After sorting ");
        for (i = 0; i < 5; i++) {
            System.out.printf("%d ",num[i]);
        }
        for (i = 0; i < 5; i++) {
            mid = (min + max)/2;
            if(num[mid] == search){
                System.out.printf("\nYour Searching number is %d and index %d\n",num[mid],mid+1);
                break;
            }   
            else if(num[mid]<search){
                min = min+1;
            }
            else{
                max = max-1;
            }
            
           count2 = count2+1;
        }
        if(count1>count2){
            System.out.println("Binary Search data Structure is batter then Linear Search ");
        }
        else{
            System.out.println("Linear Search Data Structure is then Binary Search ");
        }
    }
}
