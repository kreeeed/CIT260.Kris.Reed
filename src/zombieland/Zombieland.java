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
      Zombieland myGame = new Zombieland();
      myGame.getName();
      myGame.displayHelp();
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