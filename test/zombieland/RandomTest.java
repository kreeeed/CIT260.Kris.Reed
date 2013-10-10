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
        short age=15;
        double weight=150;
        expectedResult=.5;
        expectedResult2=50;        
        Random instance = new Random();
        instance.lifeExpect();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        
        System.out.println("lifeExpect-Test 2");
        short age=-5;
        double weight=150;
        expectedResult=-.75;
        expectedResult2=-75;        
        Random instance = new Random();
        instance.lifeExpect();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("lifeExpect-Test 3");
        short age=15;
        double weight=0;
        expectedResult=-.75;
        expectedResult2=-75;        
        Random instance = new Random();
        instance.lifeExpect();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("lifeExpect-Test 4");
        short age=0;
        double weight=50;
        expectedResult=.20;
        expectedResult2=20;        
        Random instance = new Random();
        instance.lifeExpect();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("lifeExpect-Test 5");
        short age=120;
        double weight=500;
        expectedResult=.1;
        expectedResult2=10;        
        Random instance = new Random();
        instance.lifeExpect();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}