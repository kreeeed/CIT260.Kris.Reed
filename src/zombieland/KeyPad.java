/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;

import java.util.Scanner;

/**
 *
 * @author K-Reed
 */
public class KeyPad { 
    int i;
    String keypadin = "";
    int num;
    public void keyPadGetIn(){
        for (i=0;i<5;i++){
            System.out.println(
 "\n\t\t\t  ____________________________"
+"\n\t\t\t |   _____________________   |"
+"\n\t\t\t |  |                     |  |"
+"\n\t\t\t |  | " + keypadin
+"\n\t\t\t |  |                     |  |"
+"\n\t\t\t |   ---------------------   |"
+"\n\t\t\t |   _____   _____   _____   |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |  |  1  | |  2  | |  3  |  |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |   -----   -----   -----   |"
+"\n\t\t\t |   _____   _____   _____   |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |  |  4  | |  5  | |  6  |  |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |   -----   -----   -----   |"
+"\n\t\t\t |   _____   _____   _____   |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |  |  7  | |  8  | |  9  |  |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |   -----   -----   -----   |"
+"\n\t\t\t |           _____________   |"
+"\n\t\t\t |          |             |  |"
+"\n\t\t\t |          |      0      |  |"
+"\n\t\t\t |          |             |  |"
+"\n\t\t\t |           -------------   |"
+"\n\t\t\t  ---------------------------"
                    );
            System.out.println("Please enter a number from the keypad above.");
            Scanner inFile = new Scanner(System.in);
            String numin = inFile.nextLine();
            while (!"0".equals(numin) && !"1".equals(numin) && !"2".equals(numin) && !"3".equals(numin) && !"4".equals(numin) && !"5".equals(numin) && !"6".equals(numin) && !"7".equals(numin) && !"8".equals(numin) && !"9".equals(numin)){
                System.out.println("KeyPadException Error Try Again");
                inFile = new Scanner(System.in);
                numin = inFile.nextLine();
            }
            keypadin+=numin;
        }
        System.out.println(
 "\n\t\t\t  ____________________________"
+"\n\t\t\t |   _____________________   |"
+"\n\t\t\t |  |                     |  |"
+"\n\t\t\t |  | " + keypadin
+"\n\t\t\t |  |                     |  |"
+"\n\t\t\t |   ---------------------   |"
+"\n\t\t\t |   _____   _____   _____   |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |  |  1  | |  2  | |  3  |  |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |   -----   -----   -----   |"
+"\n\t\t\t |   _____   _____   _____   |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |  |  4  | |  5  | |  6  |  |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |   -----   -----   -----   |"
+"\n\t\t\t |   _____   _____   _____   |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |  |  7  | |  8  | |  9  |  |"
+"\n\t\t\t |  |     | |     | |     |  |"
+"\n\t\t\t |   -----   -----   -----   |"
+"\n\t\t\t |           _____________   |"
+"\n\t\t\t |          |             |  |"
+"\n\t\t\t |          |      0      |  |"
+"\n\t\t\t |          |             |  |"
+"\n\t\t\t |           -------------   |"
+"\n\t\t\t  ---------------------------"
                    );
        if ("31337".equals(keypadin)){
           Items.gun=true;
           System.out.println("The safe opens and you grab a shotgun and a glock. You make sure to pick up a couple of packs of rounds and put them in your backpack.");
        }
        else{
            System.out.println("The keypad beeps angrily. The safe remains locked.");
        }
    }
}
