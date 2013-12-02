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
public class NeighborHouseView {
    private final static String[][] menuItems = {
        {"K", "Search the House for the Car Keys"},
        {"G", "Search the Garage for the Car Keys"},
        {"A", "Go Back to your Apartment"},
        {"H", "Hide in a closet"},
        {"P", "Pause Menu"},        
        {"Q", "Quit"}        
    };
     private NeighborHouseControl neighborHouseControl = new NeighborHouseControl();
  

 
    
  
    // display the help menu and get the end users input selection
    public String getInput() {       
        String gameStatus = "PAUSE";
        String command ="";
        do {
            this.display();
            
            // get commaned entered
            command = this.getCommand();
            switch (command) {
                case "K":
                    this.neighborHouseControl.displaySearchHouse();
                    break;
                case "G":
                    this.neighborHouseControl.displaySearchGarage();
                    break;
                case "A":
                    command = "Q";
                    break;
                case "H":
                    this.neighborHouseControl.displayHide();
                    break;   
                case "P":
                    this.neighborHouseControl.displayPause();
                    break;
                case "Q": 
                    return "QUIT";
            }
        } while (!command.equals("Q"));  
        
         return gameStatus;
    }
    
    public final void display() {
        System.out.println("\n\t===============================================================");
         System.out.println("\n\t As you walk over to your neighbor's house, you notice his car is "
                 + "\n\t still in the driveway, but the keys aren't in it. You hear loud banging "
                 + "\n\t coming from the garage, which is luckily closed. You know his car is "
                 + "\n\t reliable. Time to find some car keys. The front door is ajar and the "
                 + "house is kind of a mess.");
        System.out.println("\tWhat is your next move?");

        for (int i = 0; i < NeighborHouseView.menuItems.length; i++) {
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
        for (String[] item : NeighborHouseView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
  

}
