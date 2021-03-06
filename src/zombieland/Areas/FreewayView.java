/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland.Areas;

import java.util.Scanner;
import zombieland.FreewayControl;

/**
 *
 * @author K-Reed
 */
public class FreewayView {
    private final static String[][] menuItems = {
        {"W", "Leave town on foot via the Freeway"},
        {"D", "Drive out of town (requires a car)"},
        {"L", "Look around for a car to drive"},
        {"G", "Go back to your apartment."},
        {"P", "Pause Menu"},              
    };
     private FreewayControl freewayControl = new FreewayControl();
  

 
    
  
    // display the help menu and get the end users input selection
    public String getInput() {       
        String gameStatus = "RUN";
        String command ="";
        do {
            this.display();
            
            // get commaned entered
            command = this.getCommand();
            switch (command) {
                case "W":
                    command = this.freewayControl.displayWalk();
                    break;
                case "D":
                    this.freewayControl.displayDrive();
                    break;
                case "L":
                    command = this.freewayControl.displayLook();
                    break;
                case "G":
                    command = "Q";
                    break;   
                case "P":
                    this.freewayControl.displayPause();
                    break;   
            }
        } while (!command.equals("Q") && !command.equals("Dead"));  
        if (!command.equals("Q")){
         return gameStatus;
        }
        else{
            return command;
        }
}     
    public final void display() {
        System.out.println("\n\t==============================================================="
                + "\n\t You approach the freeway out of town. Cars are parked almost randomly."
                + "\n\t Several appear to have bodies in them. There is a gap large enough "
                + "\n\t to fit a car through. ");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < FreewayView.menuItems.length; i++) {
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
        for (String[] item : FreewayView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
  
}


