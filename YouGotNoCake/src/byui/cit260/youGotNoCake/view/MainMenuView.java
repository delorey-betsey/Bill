package byui.cit260.youGotNoCake.view;
/**
 *
 * @author Betsey
 */
public class MainMenuView extends View {
    
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
                this.saveGame();
                break;
            case 'E': //exit the program
                return false;
            default:
                System.out.println("Invalid selection - must be one valid letter.");
        }
        return false;
    }
    
     private void displayLocationMenu() {
        //display Help menu

        LocationMenuView locationMenu = new LocationMenuView();
        locationMenu.displayLocationMenu();
    }
    
    private void startExistingGame() {
        //START EXISTING GAME ** ADD LANGUAGE TO GET SAVED GAME
        System.out.println("*** startExistingGame function called ***");
    }
    
    private void displayHelpMenu() {
        //display Help menu

        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
    private void saveGame() {
        System.out.println("*** saveGame function called ***");    
    }    
}
