/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package startPlayer;

import java.util.Scanner;

/**
 *
 * @author K-Reed
 */
public class startPlayer {

    /**
     * @param args the command line arguments
     */
    String name;
    String instructions = "";
    public static void main(String[] args) {
      startPlayer myCharacter = new startPlayer();
      myCharacter.getName();
      myCharacter.displayHelp();
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