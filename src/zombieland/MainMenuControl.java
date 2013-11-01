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
   double[] foreach = {8, 9, 12,25,50,10,22};

 public void displayForeach() {
        System.out.println(foreach);
        int sum = 0;
         for (int k = 0; k < foreach.length; k++) { 
         sum += foreach[k];
         System.out.println(sum);
         }}


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


