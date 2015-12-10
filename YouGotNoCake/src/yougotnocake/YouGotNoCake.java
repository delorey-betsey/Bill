
package yougotnocake;

import byui.cit260.youGotNoCake.control.GameControl;
import byui.cit260.youGotNoCake.model.Player;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class YouGotNoCake {
    
    private static ObjectOutputStream gameFile = null;
    private static ObjectInputStream objectIn = null;
    private static PrintWriter logFile = null;
    private static Player savedPlayer  = null;
            
    public static void main(String[] args){
        try{
            // Create the log file.
            logFile = new PrintWriter("log.txt");
            
           //create Start ProgramView and start the program
           GameControl gameControl = new GameControl();
           gameControl.displayGameMenu();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            // check files, if they exist - close them
            if (logFile != null) {
                logFile.flush();
                logFile.close();
            }
            
            }
    }

    /**
     * Save the Game to file
     * @param player - the object to save
     */
    public static void saveGamePlayer(Player player) {
        //Create the save game data file and store the player object in it
            try {
                gameFile = new ObjectOutputStream(new FileOutputStream("youGotNoCakeSavedGame.data"));
                gameFile.writeObject(player);
                gameFile.flush();
                gameFile.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                if(gameFile != null) {
                    try {
                        gameFile.close();
                    } catch (Exception ex){
                        ex.printStackTrace();
                    }
                }
            }
    }
    
    /**
     * Get the player from file
     * @return the saved game player
     */
    public static Player getSavedPlayer() {
        //Open the save game data file and retrieve player from it
        try {
             objectIn = new ObjectInputStream(new FileInputStream("youGotNoCakeSavedGame.data"));
             savedPlayer = (Player) objectIn.readObject();
             objectIn.close();             
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally{
            if (objectIn != null){
                try {
                    objectIn.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } 
            
            return savedPlayer;
    }
    
    public static ObjectInputStream getObjectIn() {
        return objectIn;
    }

    public static void setObjectIn(ObjectInputStream objectIn) {
        YouGotNoCake.objectIn = objectIn;
    }

    

    public static void setSavedPlayer(Player savedPlayer) {
        YouGotNoCake.savedPlayer = savedPlayer;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        YouGotNoCake.logFile = logFile;
    }

    public static ObjectOutputStream getGameFile() {
        return gameFile;
    }

    public static void setGameFile(ObjectOutputStream gameFile) {
        YouGotNoCake.gameFile = gameFile;
    }
    
 }   
    
  

