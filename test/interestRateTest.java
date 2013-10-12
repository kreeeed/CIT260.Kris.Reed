/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import zombieland.Random;

/**
 *
 * @author K-Reed
 */
public class interestRateTest {
    
    public interestRateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of intPayment method, of class interestRate.
     */
    @Test
    public void testIntPayment() {
        System.out.println("intPayment-test 1");
        int loan = 1000;
        double intRate=10;
        double expResult=8.3;
        interestRate instance = new interestRate();
        double result=instance.intPayment(loan, intRate);
         assertEquals(expResult, result, 8.3);
                 
     System.out.println("intPayment-test 2");
        loan = -5;
        intRate=10;
        expResult=-0.041666666666666664;
        result=instance.intPayment(loan, intRate);
         assertEquals(expResult, result, 0.0);
     
    System.out.println("intPayment-test 3");
        loan = 1000;
        intRate=-5;
        expResult=-4.166666666666667;
        result=instance.intPayment(loan, intRate);
         assertEquals(expResult, result, 0.0);
         
     System.out.println("intPayment-test 4");
        loan = 1;
        intRate=1;
        expResult=8.333333333333334E-4;
        result=instance.intPayment(loan, intRate);
         assertEquals(expResult, result, 0.0);
         
      System.out.println("intPayment-test 5");
        loan = 1000000;
        intRate=200;
        expResult=166666.66666666666;
        result=instance.intPayment(loan, intRate);
         assertEquals(expResult, result, 0.0);
    }
}
