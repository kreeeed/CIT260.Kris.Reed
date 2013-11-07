/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;


/**
 *
 * @author jacksonrkj
 */
public class FreewayControl  {
    
    public String displayWalk(){
        if(Items.gun==false){
        System.out.println("\n\t==============================================================="
                + "\n\t You decide your best bet on survival is to get out of town as fast as possible"
                + "\n\t You leave as quickly as possible, skirting around on the shoulder of the freeway"
                + "\n\t to avoid any undead lurking within the cars."
                + "\n\t All seems to go well until you slip on some loose gravel and fall, sending some "
                + "\n\t of the gravel skittering across the road. Some zombies stir within the cars."
                + "\n\t You try to run, but as you attempt to scrabble to your feet, half a body reaches "
                + "\n\t out from under the nearest car and grabs your ankle. You wish you had a gun or "
                + "\n\t some way to defend yourself as it sinks it's teeth into your flesh."
                + "\n\t\t\t\t THE END");
        }
        else{
        System.out.println("\n\t==============================================================="
                + "\n\t You decide your best bet on survival is to get out of town as fast as possible"
                + "\n\t You leave as quickly as possible, skirting around on the shoulder of the freeway"
                + "\n\t to avoid any undead lurking within the cars."
                + "\n\t All seems to go well until you slip on some loose gravel and fall, sending some "
                + "\n\t of the gravel skittering across the road. Some zombies stir within the cars."
                + "\n\t You try to run, but as you attempt to scrabble to your feet, half a body reaches "
                + "\n\t out from under the nearest car and grabs your ankle. You kick the zombie in the"
                + "\n\t head, buying you enough time to shoot it in the head."
                + "\n\t You leave town behind you and hope for the best. With no way to travel quickly"
                + "\n\t and no radio to get directions to government blockades or safezones, Its only "
                + "\n\t a matter of time until the zombies get you."
                + "\n\t\t\t\t THE END");
        }
        return "Q";
    }
    public void displayDrive(){
        if(Items.car==true){
            System.out.println("\n\t==============================================================="
                    + "\n\t You carefully manuever between cars, working your way through to the open freeway"
                    + "\n\t a few zombies get out of the parked cars to chase after you, but tey can't catch up"
                    + "\n\t You tune the radio in to the emergency broadcast system and get directions to the "
                    + "\n\t nearest safe location. You get a feeling that everything is going to turn out okay."
                    + "\n\t\t\t\t\t THE END");
        }
        else{
            System.out.println("\n\t==============================================================="
                    + "\n\t You can't drive a car you don't have.");
        }
    }
    public String displayLook(){
        System.out.println("\n\t==============================================================="
                + "\n\t You look around to see if any of the cars are driveable. Several of the empty cars appear to have "
                + "\n\t dead batteries. After this next car you'll have to try a car with a body in it. You feel elation"
                + "\n\t as the vehicle starts. You adjust the seat and reach up to adjust the rearview mirror when a zombie"
                + "\n\t appears in it. You try to whirl around to fend it off, but it's too late. You've been biten."
                + "\n\t You almost immediately feel yourself loose control as the virus takes over your body."
                + "\n\t\t\t\t\t THE END");
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
