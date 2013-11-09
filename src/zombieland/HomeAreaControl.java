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
       JoesGunView newJoes = new JoesGunView();
      newJoes.getInput();
    }   
    public void displayNeighborsHouse() {
       NeighborHouseView newNeighbor = new NeighborHouseView();
      newNeighbor.getInput();
    } 
    public void displayFreeway() {
       FreewayView newFreeway = new FreewayView();
      newFreeway.getInput();
    } 
    public void displayGasStation() {
       GasStationView newGas = new GasStationView();
      newGas.getInput();
    } 
    public String displayCloset() {
       System.out.println(
               "\n\t You grab your seventy-two hour kit and hide in the closet, "
               + "\n\t only coming out to use the bathroom. The water runs out "
               + "\n\t faster than you thought it would. Just when you are about "
               + "\n\t to get up the nerve to leave, you hear the sound of an "
               + "\n\t airplane flying close overhead. You get to the window in "
               + "\n\t time to see a flash of light before you are incinerated "
               + "\n\t by a nuclear blast."
               + "\n\t\t\t\t\t THE END ");
       return "Dead";
    }
public String displaySink() {
       System.out.println(
               "You go to the sink a nd fill a glass with water. As you take a swig you "
              + "\n\t feel like there's something you were supposed to remember about the "
              + "\n\t tap water. Suddenly, your stomach feels odd. At that moment, you"
              + "\n\t remember that the emergency broadcast said that the water is infected."
              + "\n\t This realization comes to late.You can already feel the virus taking "
              + "\n\t control of your body."
              + "\n\t\t\t\t\t THE END");
      return "Dead";
    }    
    public void displayPauseMenu() {
       PauseMenuView gamePause = new PauseMenuView();
      gamePause.getInput();
    }
}
