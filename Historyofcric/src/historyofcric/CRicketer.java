package Historyofcric;
import java.util.Scanner;

public class CRicketer {
    //name, age, country, number of runs, number of wickets, and numbers of matches. 
    public String name = "shakib";
    public int age = 30;
    public String country="Bangladesh";
    public int numrum=6000;
    public int numwik=600;
    public int numatch=150;
    public int Tmatch;
    public int Trun;
    public int Twicket;
    
   
 public void    increaseRun(int run){
    
   // Scanner input= new Scanner(System.in);
    //Trun = input.nextInt();
    Trun=run+numrum;
  
 }
public void increaseWicket(int wicket){
    //   Scanner input = new Scanner(System.in);
   // Twicket= input.nextInt();
   Twicket=wicket+numwik;
 //    System.out.println("  wicket= " +Twicket);
 }
public void  increaseMatch (int match){
    //  Scanner input = new Scanner(System.in);
   //Tmatch= input.nextInt();
    match=match+numatch;
    // System.out.println("  wicket= " +Tmatch);
 }
 public void  printIn(){
    /*Write another method named
 printIn fo that will print all the information of that cricketer*/
    System.out.println("total run = " + Trun);
      System.out.println("  wicket= " +Twicket);
     System.out.println("  match= " +(numatch+1));
}
}