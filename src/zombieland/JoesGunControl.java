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
               "\n\t That was the wrong place to go!"
               + "\n\t A rogue zombie has charged the store "
               + "\n\t\t\t And you have no way to defend yourself"
               + "\n\t You have been infected.");
    }
    
    public void displayPauseMenu() {
       PauseMenuView gamePause = new PauseMenuView();
      gamePause.getInput();
    }
    public void displayGunSafe() {
       KeyPad Keypad = new KeyPad();
    }
    public void displayAttic() {
       System.out.println(
               "\n\tThe attic has been cleaned out, there are no guns!"
               + "\n\t A rogue zombie has charged the store "
               + "\n\t\t\t And you have no way to defend yourself"
               + "\n\t You have been infected.");
    }
    void exitGame() {
       return;
    }
}

