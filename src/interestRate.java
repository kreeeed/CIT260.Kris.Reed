/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author K-Reed
 */
public class interestRate {
     public long intPayment(int loan, short intRate){
      if (loan<0 && loan>1000000){
            System.out.println("Invalid Input. Must be a positive number greater than 0 and less then 1000000.");
            return;
        }
      else {};
        if (intRate<=.1 && intRate>=200){
            System.out.println("Invalid Input. Must be a positive number greater than .1 or less than 200.");
            return;
        }
        else{};
       int monthRate=intRate/100;
       int monthRate1=monthRate/12;
        int payMent=monthRate1*loan;
        return payMent;
                
}
}
