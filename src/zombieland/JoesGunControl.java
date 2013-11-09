/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;

/**
 *
 * @author K-Reed
 */
public class JoesGunControl {
    public JoesGunControl() {
}
    public void displayHomeArea() {
       HomeAreaView helpMe = new HomeAreaView();
      helpMe.getInput();
    }   
    public void displayBathroom() {
       System.out.println(
               "\n\t ");
    }
    
    public void displayPauseMenu() {
       PauseMenuView gamePause = new PauseMenuView();
      gamePause.getInput();
    }
    public void displayGunSafe() {
       KeyPad newKeypad = new KeyPad();
       newKeypad.keyPadGetIn();
    }
    public void displayAttic() {
       System.out.println(
               "\n\tThe attic has been cleaned out, there are no guns!"
               + "\n\t A rogue zombie has charged the store "
               + "\n\t\t\t And you have no way to defend yourself"
               + "\n\t You have been infected.");
    }
}

