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
class MainMenuView {

    public MainMenuView() {
    }
  private final static String[][] menuItems = {
        {"N", "New Game"},
        {"H", "Help Menu"}, 
        {"P", "Pause Menu"},
        {"C", "Credits"},
        {"Q", "Quit Game"},
              
    };
    
    // Create instance of the HelpMenuControl (action) class
    private MainMenuControl mainMenuControl = new MainMenuControl();
    
  
    // display the help menu and get the end users input selection
    public String getInput() {       
        String gameStatus = "PAUSE";
        String command ="";
        do {
            this.displayMainMenu();
            
            // get commaned entered
            command = this.getCommand();
            switch (command) {
                case "N":
                    this.mainMenuControl.startNewGame();
                    break;
                case "H":
                    this.mainMenuControl.displayHelpMenu();
                    break;
                case "P":
                    this.mainMenuControl.displayPauseMenu();
                    break;   
                case "C":
                    this.mainMenuControl.displayCredits();
                    break;   
                case "Q": 
                    return "QUIT";
            }
        } while (!command.equals("Q"));  
        
         return gameStatus;
    }

        // displays the help menu
    public final void displayMainMenu() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    
    
    // retrieves the command entered by the end user
    protected final String getCommand() {
        Scanner inFile = new Scanner(System.in);
        String command;
        boolean valid = false;
        do {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
                System.out.println("Invalid command. Please enter a valid command.");
                continue;
            }
                
        } while (!valid);
        return command;
    }
    
    
    // determines if the command is valid
    private boolean validCommand(String command) {
        for (String[] item : MainMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
  
}   

