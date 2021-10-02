/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclass;

/**
 *
 * @author HP-NPC
 */
public class MyClass {

  static int plusMethod(int x, int y) {

    return x + y;

  }

  

  static double plusMethod1(double x, double y) {

    return x + y;

  }

  

  public static void main(String[] args) {

    int myNum1 = plusMethod(8, 5);

    double myNum2 = plusMethod1(4.3, 6.26);

    System.out.println("int: " + myNum1);

    System.out.println("double: " + myNum2);

  }

}