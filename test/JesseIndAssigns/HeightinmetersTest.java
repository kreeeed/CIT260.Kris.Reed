/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JesseIndAssigns;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cheyenne
 */
public class HeightinmetersTest {
    
    public HeightinmetersTest() {
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
     * Test of heightMeters method, of class Heightinmeters.
     */
    @Test
    public void testHeightMeters() {
        System.out.println("heightMeters");
        double h = -5;
        Heightinmeters instance = new Heightinmeters();
        instance.heightMeters(h);
        h = 2;
        Heightinmeters instance2 = new Heightinmeters();
        instance2.heightMeters(h);
        h = 0;
        Heightinmeters instance3 = new Heightinmeters();
        instance3.heightMeters(h);
    }
}