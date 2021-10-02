/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q19;

/**
 *
 * @author HP-NPC
 */


   public class Bicycle implements Vehicle{  
    int speed;
    int gear;
    @Override
    public void changeGear(int newGear){  
        gear = newGear;
    }
    @Override
    public void speedUp(int increment){
         speed = speed + increment;
    }
    public void applyBrakes(){
        speed = speed - decrement;
    }

  
}
