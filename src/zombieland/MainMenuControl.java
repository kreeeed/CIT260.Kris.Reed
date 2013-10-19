/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;


/**
 *
 * @author K-Reed
 */
public class MainMenuControl {
    
public MainMenuControl() {
}
  



public void startNewGame() {
        System.out.println("\n\tstartNewGame() called");
        Game game=new Game();
        game.playGame();
    }
    
    public void displayHelpMenu() {
       HelpMenuView helpMe = new HelpMenuView();
      helpMe.getInput();
    }
    public void displayPauseMenu() {
       PauseMenuView gamePause = new PauseMenuView();
      gamePause.getInput();
    }
    public void displayCredits() {
       System.out.println(
               "\n\t This game created by "
               + "\n\t Kris Reed "
               + "\n\t\t\t and "
               + "\n\t Jesse White");
    }
    void exitGame() {
       return;
    }
}


