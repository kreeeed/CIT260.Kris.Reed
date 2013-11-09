/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;

/**
 *
 * @author Cheyenne
 */
public class StartNewGame {
    public static void NewGame(){
        Items.crowbar = false;
        Items.gun = false;
        Items.gas = false;
        Items.carkey = false;
        Items.car = false;
        System.out.println("\n\t BEEP ... BEEP ... BEEP ... BEEP"+
                "\n\t You reach over groggily and to turn off the alarm clock, but accidentally shove it onto the floor." +
                "\n\t It must have bumped the am radio on, because you can hear the static." +
                "\n\t The noise helps you wake up a bit, but as you reach down to turn it off, the sound abruptly ends." +
                "\n\t Perplexed, you check to see if it's still plugged in. That's when you hear the wail of the emergency" +
                "\n\t broadcast system.\n" +
                "\n\t “This is not a test! Repeat, this is not a test! The local CDC research lab has reported a breach." +
                "\n\t The group responsible stole strains of a reanimation virus that was understudy and released it into local" +
                "\n\t water supplies. Do not drink water from faucets. People infected will show immediate signs such as" +
                "\n\t muscle spasms, lack of control, inability to speak and homicidal tendencies. They will attack other" +
                "\n\t people on sight with bare hands, biting their victims. After a few hours, they will show signs of " +
                "\n\t deterioration.” The messages loops again. And again. And again.\n" +
                "\n\t Sweat begins to form on your brow. You can't help but be grateful you slept in today. Otherwise you" +
                "\n\t might have already been infected. Pulling yourself together, you get dressed and take stock of your" +
                "\n\t apartment.");
        HomeAreaView newStart = new HomeAreaView();
        newStart.getInput();
                
}
    
}
