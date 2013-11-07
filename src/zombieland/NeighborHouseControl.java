/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;


/**
 *
 * @author jacksonrkj
 */
public class NeighborHouseControl  {
    
    public String displaySearchHouse(){
        if(Items.gun==true){
            System.out.println("\n\t==============================================================="
                    + "\n\t You search through the house as quietly as possible , looking for keys to "
                    + "\n\t the car in the driveway. They aren't on the hook or anywhere you can think "
                    + "\n\t to look. You hear noise from the garage again. Maybe they're in there?");
        }
        else if(Items.crowbar==true){
            System.out.println("\n\t===============================================================");
        }
        else{
            
        }
        return "Q";
    }
    public void displaySearchGarage(){
        if(Items.car==true){
            System.out.println("\n\t===============================================================");
        }
        else{
            System.out.println("\n\t==============================================================="
                    + "\n\t You can't drive a car you don't have.");
        }
    }
    public String displayHide(){
        System.out.println("\n\t===============================================================");
        return "Q";
    }
    public String displayHome(){
        return "Q";
    }
    public void displayPause() {
       PauseMenuView gamePause = new PauseMenuView();
      gamePause.getInput();
    }
}
