/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.control;

import byui.cit260.youGotNoCake.model.Player;
import static byui.cit260.youGotNoCake.view.StartProgramView.setPlayer;

public class SetUpControl {    

    public static Player createPlayer(String name) {

        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);

        setPlayer(player);  //save the player

        return player;
    }

//    double  createNewGame(double gameID) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
  
