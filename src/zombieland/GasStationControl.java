/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;

/**
 *
 * @author K-Reed
 */
public class GasStationControl {
     public GasStationControl() {
}
  public void displayHomeArea() {
       HomeAreaView helpMe = new HomeAreaView();
      helpMe.getInput();
    }   
    public void displayRegister() {
       System.out.println(
               "\n\t Your Greed has left you vulnerable!"
               + "\n\t A rogue zombie has charged the station "
               + "\n\t\t\t And you have no way to defend yourself"
               + "\n\t You have been infected.");
    }
    
    public void displayPauseMenu() {
       PauseMenuView gamePause = new PauseMenuView();
      gamePause.getInput();
    }
    public void displayDrink() {
      System.out.println("\n\t You Can't Drink the Water!"
             + "\n\tYou've been infected "
             );
    }
    public void displayGasCan() {
       System.out.println(
               "\n\tYou now have a gas can!"
              );
    }
    void exitGame() {
       return;
    }
}
