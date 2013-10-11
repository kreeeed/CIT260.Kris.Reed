/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieland;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author K-Reed
 */
public class RandomTest {
    
    public RandomTest() {
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
     * Test of lifeExpect method, of class Random.
     */
    @Test
    public void testLifeExpect() {
        System.out.println("lifeExpect-Test 1");
        short age = 15;
        double weight = 150;
        double expResult=35;
        Random instance = new Random();
        double result=instance.lifeExpect(age, weight);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
   
        System.out.println("lifeExpect-Test 2");
        age = -5;
        weight = 150;
        expResult=-75;
        result=instance.lifeExpect(age, weight);
        assertEquals(expResult, result, 0.0);
    
        System.out.println("lifeExpect-Test 3");
        age =15;
        weight = 0;
        expResult=-90;
        result=instance.lifeExpect(age, weight);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("lifeExpect-Test 4");
        age = 0;
        weight = 50;
        expResult=20;
        result=instance.lifeExpect(age, weight);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("lifeExpect-Test 5");
        age = 120;
        weight = 500;
        expResult=10;
        result=instance.lifeExpect(age, weight);
        assertEquals(expResult, result, 0.0);
    }
}
