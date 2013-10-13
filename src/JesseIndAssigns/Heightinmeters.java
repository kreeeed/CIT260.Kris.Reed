/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JesseIndAssigns;

/**
 *
 * @author Cheyenne
 */
public class Heightinmeters {
/*
 * 1) Get height in meters
 * 2) If height is less than 0 “Invalid Input. Must be a positive number.”
 * 3) heightm * 3.28084 / .083333333 = heighti
 * 4) force heighti into a short to clip off fractions.
 * 5) Display “You are ” + heighti + “ inches tall.”
 */
    public void heightMeters(double h){
        if (h<0){
            System.out.println("Invalid input. Please enter a positive number.");
            h =(short) -999;
        }
        else{    
        h = (short)(h * 3.28084 / .083333333);
        }
        System.out.println("You are " + h + " inches tall.");
    }
}
