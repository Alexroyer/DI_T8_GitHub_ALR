/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Alejandro
 */
public class UtilsTest {
    
    public UtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("* UtilsTest: @BeforeClass method");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("* UtilsTest: @AfterClass method");
    }
    
    @Before
    public void setUp() {
        System.out.println("* UtilsTest: @Before method");
    }
    
    @After
    public void tearDown() {
        System.out.println("* UtilsTest: @After method");
    }

@Test public void helloWorldCheck() { 
        System.out.println("* UtilsTest: test method 1 - helloWorldCheck()"); 
        assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!")); 
}    


    //ESTA LÍNEA ESTABLECE UN TIEMPO LÍMITE DE 1000 MILISEGUNDOS
    @Test(timeout=1000)
    public void testWithTimeout() {
        final int factorialOf = 1 + (int) (30000 * Math.random());
        System.out.println("computing " + factorialOf + '!');
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }
    
    @Ignore
    @Test
    public void temporarilyDisabledTest() throws Exception {
        System.out.println("* UtilsTest: test method 4 - checkExpectedException()");
        assertEquals("Malm\u00f6", Utils.normalizeWord("Malmo\u0308"));
    }
    
    //ESTA LÍNEA INDICA QUE SE ESPERA UNA EXCEPCIÓN DE TIPO IllegalArgumentException
    @Test(expected = IllegalArgumentException.class)
    public void checkExpectedException() {
        final int factorialOf = -5;
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }

    

    
}
