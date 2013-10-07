/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;

/*
 *
 * @author Jesse
 */
public class Items {
    
    boolean Crowbar; 
    boolean Medkit;
    boolean Leather;
    boolean Crossbow;
    boolean Shotgun;
    boolean Pistol;
    
    public Items() {
    }
    public void displayItems() {
        System.out.println("\t\tYou are carrying a crowbar: "+ this.Crowbar);
        System.out.println("\t\tYou are carrying a medkit: "+ this.Medkit);
        System.out.println("\t\tYou are wearing a leather jacket: "+ this.Leather);
        System.out.println("\t\tYou are carrying a crossbow: "+ this.Crossbow);
        System.out.println("\t\tYou are carrying a shotgun: "+ this.Shotgun);
        System.out.println("\t\tYou are carrying a pistol: "+ this.Pistol);
    }
}