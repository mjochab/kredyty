/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kredyty;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author defrag
 */
public class KredytTest {
    
    public KredytTest() {
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
     * Test of liczOprocentowanie method, of class Kredyt.
     */
    @Test
    public void testLiczOprocentowanieOdnawialny() {
        System.out.println("liczOprocentowanieOdnawialny");
        Kredyt instance = new Kredyt(1000,0,30,24,Typy.ODNAWIALNY);
        int expResult = (int) (1000*5-0*0.1/30-24);
        int result = instance.liczOprocentowanie();
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testLiczOprocentowanieChwilowka() {
        System.out.println("liczOprocentowanieChwilowka");
        Kredyt instance = new Kredyt(1000,0,30,24,Typy.CHWILOWKA);
        int expResult = (int) (1000*2-0*0.3/30-24);
        int result = instance.liczOprocentowanie();
        assertEquals(expResult, result);       
    }

    @Test
    public void testLiczOprocentowanieHipoteczny() {
        System.out.println("liczOprocentowanieHipoteczny");
        Kredyt instance = new Kredyt(1000,0,30,24,Typy.HIPOTECZNY);
        int expResult = (int) (1000*2-0*0.6/30+24);
        int result = instance.liczOprocentowanie();
        assertEquals(expResult, result);       
    }
}
