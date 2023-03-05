/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package numerosprimos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergio
 */
public class CribaEratostenesTest {

    @Test
    public void testGenerarPrimos0() {
        System.out.println("generarPrimos"); 
        int max = 0;
        int expResult = 0;
        int[] primos = CribaEratostenes.generarPrimos(max);
        assertEquals(expResult, primos.length);
    }
    
    @Test
    public void testGenerarPrimos2() {
        System.out.println("generarPrimos"); 
        int max = 2;
        int expResult = 1;
        int[] primos = CribaEratostenes.generarPrimos(max);
        assertEquals(expResult, primos.length);
    }
    
    @Test
    public void testGenerarPrimos3() {
        System.out.println("generarPrimos"); 
        int max = 3;
        int expResult = 2;
        int[] primos = CribaEratostenes.generarPrimos(max);
        assertEquals(expResult, primos.length);
    }
    
    @Test
    public void testGenerarPrimos100() {
        System.out.println("generarPrimos"); 
        int max = 100;
        int expResult = 25;
        int[] primos = CribaEratostenes.generarPrimos(max);
        assertEquals(expResult, primos.length);
    }
    
}
