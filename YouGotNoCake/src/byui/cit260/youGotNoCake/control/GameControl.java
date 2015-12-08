/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.control;

import byui.cit260.youGotNoCake.model.Player;
import byui.cit260.youGotNoCake.view.StartProgramView;

/**
 *
 * @author Betsey
 */
public class GameControl {
public void displayGameMenu() {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
}
}    
//    public static void createNewGame(Player player) {
//        System.out.println("\n*** createNewGame stub function called ***");
//    }
//    
//}