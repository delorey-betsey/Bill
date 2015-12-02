/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Betsey
 */
public class WinLossControlTest {
    
    public WinLossControlTest() {
    }

    /**
     * Test of loadWin method, of class WinLossControl.
     */
    @Test
    public void testLoadWin() {
        /****************************
         * * Test case #1 loadWin
         * **************************/
        System.out.println("loadWin");
        System.out.println("\tTest case #1");
        
        // input values for test case
        double locationID = 0.0;
        double gameStatus = 0.0;
        
        // expected output return value
        double expResult = -1;
        
        //create instance of CalcGallons class
        WinLossControl instance = new WinLossControl();
        
        // call function to run test
        double result = instance.loadWin(locationID, gameStatus);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of loadLoss method, of class WinLossControl.
     */
    @Test
    public void testLoadLoss() {
        /****************************
         * * Test case #1 loadLoss
         * **************************/
        System.out.println("loadLoss");
        System.out.println("\tTest case #1");
        
        // input values for test case
        double locationID = 0.0;
        double gameStatus = 0.0;
        
        // expected output return value
        double expResult = -1;
        
        //create instance of CalcGallons class
        WinLossControl instance = new WinLossControl();
        
        // call function to run test
        double result = instance.loadLoss(locationID, gameStatus);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
    } 
}
