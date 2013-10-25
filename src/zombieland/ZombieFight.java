/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;

import java.util.Scanner;

/**
 *
 * @author K-Reed
 */
public class ZombieFight {
   
    public String zombieGun(){
        int bullets;
        String output;
        System.out.println("A pack of zombies are charging you, how many bullets are you going to fire!");
            Scanner inFile = new Scanner(System.in);
            bullets=Integer.parseInt(inFile.nextLine());
        if (bullets>=0 && bullets<5){
            output = "You didn't fire enough bullets, you have been infected";
        }
        else if (bullets>=5 && bullets<=9 ){
            output = "You slowed the zombies down and now are on the run";
        }
        else if (bullets>9 && bullets<=15 ){
            output = "You wasted them";
        }
        else if (bullets>16 && bullets<=20 ){
            output = "Overkill. There's Zombie Brains Everywhere!"; 
        }
        else{
            output ="You don't have that many bullets";
        }
    System.out.println(output);
    return output;
}
}

  