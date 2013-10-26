/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;

/**
 *
 * @author Cheyenne
 */
public class HomeStart {
    private final static String[][] menuItems = {
        {"F", "Go to the freeway"},
        {"N", "Check out the Neighbor's house"},
        {"J", "Go to Crazy Joe's Gun Store"},
        {"G", "Go to the Gas Station"},
        {"H", "Hide in a closet"},
        {"P", "Pause Menu"},        
        {"Q", "Quit"}        
    };
    
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HomeStart.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
}
