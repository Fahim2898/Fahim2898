
package javaapplication24;


/*class Triangle {
 int height;
 double base;
 Triangle (int height, int w){
 height=height;
 base=w;
 }
 void computeArea(){
 return height*w*changeValue(2);
 }
 void printInfo(){
 System.out.println("height is:"+h+",base is:"+w);
 }
}
public class Main {
 public static void main(String[] args) {
 int[] a = new int[4];
 for (int i = 1; i < 4; i++) {
 a[i] = input.nextDouble();
 }
 Scanner input =new Scanner();
 double h = input.nextLine();
 int w = input.nextDouble();
 Triangle obj=new Triangle(id);
 int b = obj.computeArea();
 obj.printInfo();
 }
}
*/

import java.util.Scanner;
import pakegnam.Triangle;

public class Exam {

    
    public static void main(String[] args) {
  
 int a[] = new int[4];
 for (int i = 1; i < 4; i++) {
 Scanner input =new Scanner(System.in);
 a[i] = input.nextInt();
 }
 Scanner input =new Scanner(System.in);
 double h = input.nextDouble( );
 int w= input.nextInt() ;
 Triangle obj =new Triangle();
  obj.computeArea();
  obj.printInfo();
    }
}
    