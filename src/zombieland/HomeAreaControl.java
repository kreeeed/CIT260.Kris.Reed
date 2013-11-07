/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;

/**
 *
 * @author K-Reed
 */
public class HomeAreaControl {
  public HomeAreaControl() {
}
    public void displayJoesGun() {
       JoesGunView helpMe = new JoesGunView();
      helpMe.getInput();
    }   
    public void displayNeighborsHouse() {
       NeighborHouseView helpMe = new NeighborHouseView();
      helpMe.getInput();
    } 
    public void displayFreeway() {
       FreewayView helpMe = new FreewayView();
      helpMe.getInput();
    } 
    public void displayGasStation() {
       GasStationView helpMe = new GasStationView();
      helpMe.getInput();
    } 
    public void displayCloset() {
       System.out.println(
               "\n\t That was the wrong place to go!"
               + "\n\t Zombies swarm your house "
               + "\n\t\t\t And you have no way to defend yourself"
               + "\n\t You have been infected.");
    }
public void displaySink() {
       System.out.println(
               "\n\t You know you're not suppose to drink the water!"
               + "\n\t You should have listened to that radio broadast better."
               + "\n\t You have been infected ");
    }    
    public void displayPauseMenu() {
       PauseMenuView gamePause = new PauseMenuView();
      gamePause.getInput();
    }
    
    void exitGame() {
       return;
    }
}
