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
public class GasStationView {
    private final static String[][] menuItems = {
        {"H", "Go back to the House"},
        {"D", "Grab a Drink, You're Thirty"},
        {"G", "Grab a Gas Can and fill it up"},
        {"M", "Take money from the register"},
        {"P", "Pause Menu"},        
        {"Q", "Quit"}        
    };
     private MainMenuControl mainMenuControl = new MainMenuControl();
  

 
    
  
    // display the help menu and get the end users input selection
    public String getInput() {       
        String gameStatus = "PAUSE";
        String command ="";
        do {
            this.displayGasStation();
            
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
                    case "F":
                    this.mainMenuControl.displayForeach();
                    break;
                case "Q": 
                    return "QUIT";
            }
        } while (!command.equals("Q"));  
        
         return gameStatus;
    }
    
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\n\tHopefully there is some gas to be pumped");
        System.out.println("\tMake a choice:");

        for (int i = 0; i < GasStationView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
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
        for (String[] item : GasStationView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
  
}

