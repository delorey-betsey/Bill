/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.control;

import byui.cit260.youGotNoCake.model.Player;

/**
 *
 * @author brnlow
 */
public class WinControl {
    private Player winner;
    
    public WinControl(Player player) {
        winner = player;
    }
    /*
     * Sorry Betsey, wrote this while I was tired.  As originally written, this 
     * will cause all sorts of wackiness since calling checkForWin() will ALWAYS result in 
     * a winning message and end the game.  I am fixing now with an additional
     * if block wrapping the displayWinMessage.
     */
    public void checkForWin() {
        String winningList = null;
        if (winner.getFoundCakeIngredients().size() == 4){
            winningList = "cake ingredients";
        }
        if (winner.getFoundPartySupplies().size() == 4) {
            winningList = "party supplies";
        }
        if (winner.getFoundSleepAids().size() == 4 ) {
            winningList = "sleep aids";
        }
        if (winningList != null) {
            displayWinMessage(winningList);
        }
    }
    
    public void displayWinMessage(String winList) {
        System.out.println("Congratulations " + winner.getName() + ", you collected all items on the " + winList + " list!");
        System.out.println("You WIN !!!!!");
        System.exit(0);
    }
    
}
