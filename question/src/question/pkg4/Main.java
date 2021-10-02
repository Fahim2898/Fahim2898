/* public class Main {
 public static void main(String[] args) {
int[] a = new int[4]; for (int i = 1; i < 4; i++) { a[i] = input.nextDouble(); }
 Scanner input =new Scanner();
 double h = input.nextLine();
 int w = input.nextDouble(); Triangle obj=new Triangle(id);
 int b = obj.computeArea(); obj.printInfo();}} */
package question.pkg4;
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {//here don't use array 
  Triangle obj = new Triangle();
 Scanner input = new Scanner(System.in);
 int h = input.nextInt();// here h int type and don't use nextLine
 int w = input.nextInt();//here don't use nextDouble
 obj.triangle(h, w);
 double b = obj.computeArea();//here we receive data from computeArea method
 obj.printInfo(b);//for print all thing we send b
 }
}

