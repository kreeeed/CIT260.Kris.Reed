/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;

/**
 *
 * @author K-Reed
 */
public class GasStationControl {
     public GasStationControl() {
}
  public void displayHomeArea() {
       HomeAreaView helpMe = new HomeAreaView();
      helpMe.getInput();
    }   
    public String displayRegister() {
       System.out.println(
               "\n\t You cross the room and reach over the counter, taking wads of "
               + "\n\t cash and stuffing them into your pockets. As you reach back for "
               + "\n\t the last of the twenties, a decomposed hand appears from behind"
               + "\n\t the counter and grabs you by the wrist. Before you can react, the"
               + "\n\t hand yanks your arm down below the counter. You feel teeth sinking "
               + "\n\t into your arm. You have been infected. In a matter of moments you "
               + "\n\t feel the virus take control of your body. Looks like your greed "
               + "\n\t got the better of you."
               + "\n\t\t\t\t\t THE END");
       return "Dead";
    }
    public void displayPauseMenu() {
       PauseMenuView gamePause = new PauseMenuView();
      gamePause.getInput();
    }
    public String displayDrink() {
      System.out.println("\n\t You grab the largest size available and fill it to the "
              + "\n\t top. As you take a swig you savor the flavor. Suddenly, your "
              + "\n\t stomach feels odd. At that moment, you remember that soda fountains"
              + "\n\t use water from the tap and carbonate it on site. You've been "
              + "\n\t infected by the contaminated water. You have been infected. In "
              + "\n\t a matter of moments you feel the virus take control of your body."
              + "\n\t\t\t\t\t THE END");
      return "Dead";
    }
    public String displayGasCan() {
       if (Items.crowbar==true){
        System.out.println("\n\t You grab the gas canister off the shelf and turn to head out to the "
                + "\n\t gas pump. Standing in the door is your old friend Jim. He looks just "
                + "\n\t like he always does, tall and lean, dressed in jeans and a t-shirt "
                + "\n\t with a baseball cap, his for one exception. His face has been half-"
                + "\n\t eaten. Strips of the remaing skin hang from his checkbones, his teeth"
                + "\n\t  visible through the gore. He lunges at you, but you are faster. "
                + "\n\t Crowbar in hand, you crush his skull in one fluid motion. He falls "
                + "\n\t lifelessly to the floor, where you cave in his skull again, just to "
                + "\n\t be sure he's dead. With Jim taken care of, you head out to the pump and "
                + "\n\t fill the gas canister.");
       Items.gas=true;
       }
       else if (Items.gun==true){
        System.out.println(
               "\n\t You grab the gas canister off the shelf and turn to head out to the "
                + "\n\t gas pump. Standing in the door is your old friend Jim. He looks just "
                + "\n\t like he always does, tall and lean, dressed in jeans and a t-shirt "
                + "\n\t with a baseball cap, his for one exception. His face has been half-"
                + "\n\t eaten. Strips of the remaing skin hang from his checkbones, his teeth"
                + "\n\t visible through the gore. He lunges at you, but you are faster, pulling "
                + "\n\t the pistol from your waistband an pistol whipping him across the face. "
                + "\n\t He staggers, teeth skittering across the floor. Before he can turn to bite,"
                + "\n\t you put the gun to his head and pull the trigger, splattering bits of gray "
                + "\n\t matter and congealed blood onto the wall behind him. He falls over "
                + "\n\t lifelessly on the floor, where you stomp on his head, crushing it, just to "
                + "\n\t be sure he's dead. With Jim taken care of, you head out to the pump and "
                + "\n\t fill the gas canister.");
       Items.gas=true;
       }
       else{
        System.out.println(
                "\n\t You grab the gas canister off the shelf and turn to head out to the "
                + "\n\t gas pump. Standing in the door is your old friend Jim. He looks just "
                + "\n\t like he always does, tall and lean, dressed in jeans and a t-shirt "
                + "\n\t with a baseball cap, his for one exception. His face has been half-"
                + "\n\t eaten. Strips of the remaing skin hang from his checkbones, his teeth"
                + "\n\t visible through the gore. He lunges at you, grabbing you in a bear hug "
                + "\n\t and sinking his teeth into your neck. You have been infected. In "
                + "\n\t a matter of moments you feel the virus take control of your body, "
                + "\n\t Jim feeding on you all the while."
                + "\n\t\t\t\t\t THE END"); 
        return "Dead";
       }
       return null;
    }
}
