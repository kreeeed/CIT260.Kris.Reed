package zombieland;

/*
 *
 * @author Jesse
 */
public class Tutorial {
    
    String welcomeMsg = 
              "\n\t*********************************************************************"
            + "\n\t Welcome to the game of Incident!                                    "                            
            + "\n\t You will be choosing your path in a world infested by zombies       "
            + "\n\t Choose your path by clicking on the choices displayed on each screen"
            + "\n\t Try to make it out alive!                                           " 
            + "\n\t                                                                     "
            + "\n\t Good Luck!!!                                                        "
            + "\n\t*********************************************************************"
            + "\n\t                                                                     "
            + "\n\t The following are your default items                                "
            + "\n";

    
    public Tutorial() {
        
    }

    public void display() {
        System.out.println(this.welcomeMsg);
    }
    


}
