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
public class Zombieland {

    /**
     * @param args the command line arguments
     */
    String name;
    String instructions = "";
    public static void main(String[] args) {
      StartPlayer myPlayer= new StartPlayer();
      Zombieland myGame = new Zombieland();
        myGame.getName();
        myGame.displayHelp();
      MainDec mainDecisions= new MainDec();
      VarDec varDecisions= new VarDec();
      Tutorial tutorial = new Tutorial();
        tutorial.display();
      Items items = new Items();
        items.displayItems();  
      Random random = new Random();
        random.lifeExpect((short)25, 200);
    }

public void getName(){
Scanner input = new Scanner(System.in);
System.out.println("Enter your name: ");
this.name = input.next();

}
public void displayHelp(){
    System.out.println("\nWelcome " + this.name + "\n");
    System.out.println(this.instructions);
}
}