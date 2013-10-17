
package zombieland;

import java.util.Scanner;

/**
 *
 * @author K-Reed
 */
public class HelpMenuView  {
        
   
    private final static String[][] menuItems = {
        {"T", "Tutorial"},
        {"H", "Hints"}, 
        {"I", "Items"},
              
    };
    
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // default constructor
    public HelpMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public String getInput() {       
        String gameStatus = "HELP";
        String command = "";
        do {
            this.display();
            
            // get commaned entered
            command = this.getCommand();
            switch (command) {
                case "T":
                    this.helpMenuControl.displayTutorial();
                    break;
                case "H":
                    this.helpMenuControl.displayHints();
                    break;
                case "I":
                    this.helpMenuControl.displayItems();
                    break;                  
                case "Q": 
                    return "QUIT";
            }
        } while (!command.equals("Q"));  
        
         return gameStatus;
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
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
        for (String[] item : HelpMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
  
}
