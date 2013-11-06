/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;


/**
 *
 * @author K-Reed
 */
public class PauseMenuControl {
    
public PauseMenuControl() {
}

    public void displayHelpMenu() {
       HelpMenuView helpMe = new HelpMenuView();
      helpMe.getInput();
    }

    void exitGame() {
       return;
    }
}


