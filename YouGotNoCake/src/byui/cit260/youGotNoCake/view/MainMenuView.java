package byui.cit260.youGotNoCake.view;

import byui.cit260.youGotNoCake.model.Player;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import yougotnocake.YouGotNoCake;

public class MainMenuView extends View {
    
    private Player mmvPlayer; 
    
    public MainMenuView() {
        super("\n"
        +"-----------------------------------------------------------------------"
        +"\n          Main Menu"
        +"\n-----------------------------------------------------------------------"
        +"\n          N - Start new game"
        +"\n          G - Get and start existing game"
        +"\n          H - Get help on how to play the game"
        +"\n          S - Save game"
        +"\n          E - Exit"
        +"\n-----------------------------------------------------------------------");
    }

    public MainMenuView(Player player) {
        super("\n"
        +"-----------------------------------------------------------------------"
        +"\n          Main Menu"
        +"\n-----------------------------------------------------------------------"
        +"\n          N - Start new game"
        +"\n          G - Get and start existing game"
        +"\n          H - Get help on how to play the game"
        +"\n          S - Save game"
        +"\n          E - Exit"
        +"\n-----------------------------------------------------------------------");
        mmvPlayer = player;
    }
    
    @Override
    public boolean doAction(Object obj){
        String value = (String) obj; 
        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0);
        switch (choice){
            case 'N': //create and start a new game
                this.displayLocationMenu();
                break;
            case 'G': //get and start existing game
                this.startExistingGame();
                break;
            case 'H': //display the help menu
                this.displayHelpMenu();
                break;
            case 'S': //save the current game
                this.saveGame(mmvPlayer);
                break;
            case 'E': //exit the program
                System.exit(0);
            default:
                System.out.println("Invalid selection - must be one valid letter.");
        }
        return false;
    }
    
     private void displayLocationMenu() {
        //display Help menu

        LocationMenuView locationMenu = new LocationMenuView(mmvPlayer);
        locationMenu.display();
    }
    
    private void startExistingGame() {
        mmvPlayer = YouGotNoCake.getSavedPlayer();
        this.displayLocationMenu();
    }
    
    private void displayHelpMenu() {
        //display Help menu

        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
    private void saveGame(Player player) {
       
            YouGotNoCake.saveGamePlayer(player);
       
        }
    }    

