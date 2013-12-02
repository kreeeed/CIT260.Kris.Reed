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
public class JoesGunView {
    private final static String[][] menuItems = {
        {"S", "Try to open the Safe"},
        {"A", "Check the Attic for a Gun"},
        {"B", "Hide in the Bathroom"},
        {"G", "Go Back to the Apartment"},
        {"P", "Pause Menu"},              
    };
     private JoesGunControl JoesGunControl = new JoesGunControl();
  

 
    
  
    // display the help menu and get the end users input selection
    public String getInput() {       
        String gameStatus = "PAUSE";
        String command ="";
        do {
            this.display();
            
            // get commaned entered
            command = this.getCommand();
            switch (command) {  
                case "A":
                    this.JoesGunControl.displayAttic();
                    break;   
                case "S":
                    this.JoesGunControl.displayGunSafe();
                    break;
                case "B":
                    this.JoesGunControl.displayBathroom();
                    break; 
                case "G":
                    command="Q";
                    break;
                case "P":
                    this.JoesGunControl.displayPauseMenu();
                    break;
            }
        } while (!command.equals("Q"));  
        
         return gameStatus;
    }
    
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\n\tThere has to be some guns somewhere!");
        System.out.println("\tWhere to look?");

        for (int i = 0; i < JoesGunView.menuItems.length; i++) {
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
        for (String[] item : JoesGunView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
  
}


