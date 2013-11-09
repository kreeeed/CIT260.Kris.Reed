/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;

import java.util.Scanner;

/**
 *
 * @author Cheyenne
 */
class HomeAreaView{
public HomeAreaView() {
    
}
    private final static String[][] menuItems = {
        {"F", "Go to the freeway"},
        {"N", "Check out the Neighbor's house"},
        {"J", "Go to Crazy Joe's Gun Store"},
        {"G", "Go to the Gas Station"},
        {"D", "Grab drink water from the faucet"},
        {"H", "Hide in a closet"},
        {"P", "Pause Menu"},      
    };
     private HomeAreaControl homeAreaControl = new HomeAreaControl();
  

 
    
  
    // display the help menu and get the end users input selection
    public String getInput() {       
        String gameStatus = "PAUSE";
        String command ="";
        do {
            this.display();
            
            // get commaned entered
            command = this.getCommand();
            switch (command) {
                case "J":
                    this.homeAreaControl.displayJoesGun();
                    break;
                case "N":
                    this.homeAreaControl.displayNeighborsHouse();
                    break;
                case "P":
                    this.homeAreaControl.displayPauseMenu();
                    break;   
                case "F":
                    this.homeAreaControl.displayFreeway();
                    break;  
                    case "G":
                    this.homeAreaControl.displayGasStation();
                    break;
                        case "H":
                    this.homeAreaControl.displayCloset();
                    break;   
               case "D":
                    this.homeAreaControl.displaySink();
                    break; 
            }
        } while (!command.equals("Q"));  
        
         return gameStatus;
    }
    
    public final void display() {
        System.out.println("\n\t==============================================================="
                + "\n\t You live in a small studio apartment. The only thing useful here is the "
                + "\n\t seventy-two hour emergency kit your mom got you last christmas. After "
                + "\n\t thinking for a moment, you come up with a few ideas of places you could go.");
        System.out.println("\n\tEnter the letter of your next decision:");

        for (int i = 0; i < HomeAreaView.menuItems.length; i++) {
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
        for (String[] item : HomeAreaView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
  
}
