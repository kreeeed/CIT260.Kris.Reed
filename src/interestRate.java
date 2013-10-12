/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author K-Reed
 */
public class interestRate {
     public double intPayment(int loan, double intRate){
      if (loan<0 ^ loan>1000000){
            System.out.println("Invalid Input. Must be a positive number greater than 0 and less then 1000000.");
        }
      else{loan=loan;}
   
        if (intRate<=1 ^ intRate>=200){
            System.out.println("Invalid Input. Must be a positive number greater than .1 or less than 200.");
        }
        else{intRate=intRate;}
    
        double monthRate=intRate / 100;
       double monthRate1=monthRate / 12;
        double payMent=monthRate1 * loan;
        System.out.println("Your payment is"+payMent);
        return payMent;
                
}
}
