/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;


/**
 *
 * @author jacksonrkj
 */
public class HelpMenuControl  {
    
    public HelpMenuControl() {
        
    } 
    public String[] organizeAreas(String[] list){
        String tmpArea;
        boolean notDone = true;
        while(notDone) {
            
            notDone = false; // assume that you done
            for (int i = 0; i < list.length-1; i++) {
                int compareResult = list[i].compareTo(list[i+1]);
                if (compareResult > 0) {
                    // swap names
                    tmpArea = list[i];
                    list[i] = list[i+1];
                    list[i+1] = tmpArea;
                    notDone = true;
                } 
            }
        }

        return list;
    }
    
    public void displayTutorial() {
        System.out.println();
        this.displayHelpBoarder();             
        System.out.println( 
                "\tThe objective of Zombieland is to run away from the impending zombie attack. "
                + "\n\tYou will be able to make decisions on where you want to go and what "
                + "\n\tyou want to do from a list of options given. Certain Items will provide certain options "
                + "\n\tof survival. Good luck!");
       }
    
    
        
    public void displayHints() {
        System.out.println();
        displayHelpBoarder();     
        System.out.println( 
                "\tThe only way to get out of the town safely is to hit the highway." 
                +"\n\tNaturally the best way to get to the highway is with a car."
                +"\n\tFind the items to unlock certain choices to lead to starting the car and driving to safety."
                +"\n\tCaution: make the wrong decision and you may not survive."
                +"\n\t"
                
                ); 
           }
            
    public void displayItems() {
        System.out.println();
        displayHelpBoarder();     
        
        if (Items.crowbar == true){
            System.out.println("\n\t You are carrying a crowbar.");
        }
        if (Items.gun == true){
            System.out.println("\n\t You are carrying a handgun.");
        }
        if (Items.safekey == true){
            System.out.println("\n\t You are carrying a small key. Looks like it might be for a safe.");
        }
        if (Items.carkey == true){
            System.out.println("\n\t You are carrying a set of car keys.");
        }
        if (Items.car == true){
            System.out.println("\n\t You found a car at your neighbor's house.");
        }
        if (Items.gas == true){
            System.out.println("\n\t You have filled the car with gas.");
        }
        if (Items.crowbar == false && Items.gun == false && Items.safekey == false && Items.carkey == false && Items.car == false && Items.gas == false){
            System.out.println("\n\t You are carrying nothing.");
        }
    }
   
    
    
    public void displayHelpBoarder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
  
}
