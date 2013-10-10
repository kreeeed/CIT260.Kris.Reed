/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;

import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class Random {
    short age;
    double weight;
    String age2;
    String weight2;
    public void getStats(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        this.age2 = input.next();
        this.age = (short)Integer.parseInt(age2);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        this.weight2 = input2.next();
        this.weight = (double)Integer.parseInt(weight2);
}
    public void lifeExpect(){
        if (age<0 ^ age>120){
            System.out.println("Invalid Input.");
        }
        else if (age>0 && age<=15 ){
            age = 10;
        }
        else if (age>15 && age<=25 ){
            age = 25;
        }
        else if (age>25 && age<=35 ){
            age = 40;
        }
        else if (age>35 && age<=55 ){
            age = 30;
        }
        else if (age>55 && age<=70 ){
            age = 20;
        }
        else {
            age = 10;
        }
        if (weight<50 ^ weight>500 ){
            System.out.println("Invalid Input.");
        }
        else if (weight>50 && weight<=100 ){
            weight = 10;
        }
        else if (weight>100 && weight<=150 ){
            weight = 25;
        }
        else if (weight>150 && weight<=200 ){
            weight = 40;
        }
        else if (weight>200 && weight<=250 ){
            weight = 30;
        }
        else if (weight>250 && weight<=300 ){
            weight = 20;
        }
        else if (weight>300 && weight<=400 ){
            weight = 15;
        }
        else {
            weight = 0;
        }
    double exp = (age+weight)/100;
    double exp2 = exp * 100;
    short exp3 = (short)exp2;
    System.out.println("Your life expectancy is "+ exp +" or " + exp3+"%");
    }
}
