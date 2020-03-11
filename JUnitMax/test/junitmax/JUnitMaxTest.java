/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitmax;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alejandro
 */
public class JUnitMaxTest {
    
    public JUnitMaxTest() {
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
     * Test of max method, of class JUnitMax.
     */
    
    @Test
    public void testMax345()
    {
        System.out.println("Test con 3, 4 y 5");
        
        int[] a = new int[3];        
        a[0] = 3;
        a[1] = 4;
        a[2] = 5;
        int expResult = 5;
        int result = JUnitMax.max(a);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testMaxOrden()
    {
        System.out.println("Test en orden aleatorio");
        
        int[] a = new int[3];        
        a[0] = 3;
        a[1] = 2;
        a[2] = 1;
        int expResult = 3;
        int result = JUnitMax.max(a);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testMaxUnaCifra()
    {
        System.out.println("Test de una sola cifra");
        
        
        int[] a = new int[5];        
        a[2] = 5;
        
        int expResult = 5;
        int result = JUnitMax.max(a);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testMaxNegativos()
    {
        System.out.println("Test de valores negativos");
        
        int[] a = new int[3];        
        a[0] = -3;
        a[1] = -2;
        a[2] = -1;
        
        int expResult = -1;
        int result = JUnitMax.max(a);
        assertEquals(expResult, result);        
    }
    
    @Test 
    public void testMaxVacio()
    {
        System.out.println("Test de array vacio");
        
        int[] a = new int[3];     
        int expResult = 0;
        int result = JUnitMax.max(a);
        assertEquals(expResult, result);        
    }
    
    @Test (expected=NullPointerException.class)
    public void testMaxNull()
    {
        System.out.println("Test con null");
        
        
        int[] a = null;
        int expResult = 0;
        int result = JUnitMax.max(a);
        assertEquals(expResult, result);
        
    }    
    
}
