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
public class GasStationView extends SuperAreaView  {
    public GasStationView(){
         super(GasStationView.menuItems);
    }
    private final static String[][] menuItems = {
        {"D", "Grab a Drink from the soda fountain"},
        {"G", "Grab the Gas Can and fill it up"},
        {"M", "Take the money from the register"},
        {"G", "Go back to the Apartment"},
        {"P", "Pause Menu"},                
    };
     private GasStationControl GasStationControl = new GasStationControl();
  

 
    
  
    // display the help menu and get the end users input selection
    public String getInput() {       
        String gameStatus = "RUN";
        String command ="";
        do {
            this.displayGasStation();
            
            // get commaned entered
            command = this.getCommand();
            switch (command) {
               case "D":
                    this.GasStationControl.displayDrink();
                    break;   
                case "G":
                    this.GasStationControl.displayGasCan();
                    break;
                case "M":
                    this.GasStationControl.displayRegister();
                    break;
                case "H":
                    command= "Q";
                    break;
                case "P":
                    this.GasStationControl.displayPauseMenu();
                    break; 
            }
        } while (!command.equals("Q"));  
        
         return gameStatus;
    }
    
    public final void displayGasStation() {
        System.out.println("\n\t===============================================================");
        System.out.println("\n\t You approach a deserted gas station. It appears that the pumps are "
                + "\n\t still running. Hopefully there is some gas to be pumped. The only cars "
                + "\n\t in the parking lot appear to have crashed into each other. Sadly, none"
                + "\n\t of them are in suitable driving condition. As you enter the store, you"
                + "\n\t see that it is trashed. The cash register hangs open, money still in it. "
                + "\n\t You also spot a few gas canisters on a shelf and a soda fountain "
                + "\n\t across the room.");
        System.out.println("\t Make a choice:");

     
    }
    @Override
      protected String getCommand() {
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

