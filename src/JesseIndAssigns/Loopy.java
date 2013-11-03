/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JesseIndAssigns;

/**
 *
 * @author Cheyenne
 */
public class Loopy {
    public static void main(String[] args) {
        Loopy newLoopy = new Loopy();
        newLoopy.loopIt();
    }
        public void loopIt(){
        int [] numberlist = {5, 10, 15, 20, 25, 30};
        int sum = 0;
        for (int one: numberlist){
            sum +=one;
        }
        System.out.println("The sum of the array numberlist equals " + sum + ".");
    }
}
