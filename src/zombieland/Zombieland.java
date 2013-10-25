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
      KeyPad newKeyPad = new KeyPad();
      newKeyPad.keyPadGetIn();
      ZombieFight newZombieFight = new ZombieFight();
      newZombieFight.zombieGun();
      MainMenuView newMain = new MainMenuView();
      newMain.getInput();
    }
}
