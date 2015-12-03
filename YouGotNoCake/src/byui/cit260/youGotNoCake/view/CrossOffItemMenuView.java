package byui.cit260.youGotNoCake.view;

import byui.cit260.youGotNoCake.model.CakeIngredients;
import byui.cit260.youGotNoCake.model.PartySupplies;
import byui.cit260.youGotNoCake.model.SleepAids;

public class CrossOffItemMenuView extends View {
//receive player choice and perform list tasks

    public CrossOffItemMenuView() {
        super("\n"
                + "-----------------------------------------------------------------------"
                + "\n          List Menu"
                + "\n-----------------------------------------------------------------------"
                + "\n    F - Found!  Cross item off list."
                + "\n    S - View Sleep Aids List"
                + "\n    P - View Party Supplies List"
                + "\n    C - View Cake Ingredients List"
                + "\n\n  E-Exit"
                + "\n-----------------------------------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0);
        switch (choice) {
            case 'F': //Found! Cross item off list
                this.flipFoundFlag();
                break;
            case 'S': //View Sleep Aids list
                this.viewSAList();
                break;
            case 'P': //View Party Supplies list
                this.viewPSList();
                break;
            case 'C': //View Cake Ingredients list
                this.viewCIList();
                break;
            case 'E': //exit the program
                return false;
            default:
                System.out.println("\n*** Invalid selection *** Try again.");
        }
        return false;
    }

    private void flipFoundFlag() {
        System.out.println("*** flipFoundFlag stub function called ***");
    }

    private void viewSAList() {
        //get the sorted list of Sleep Aid items for the current game
        String[] salist = new SleepAids().getSleepAidsArray();

        System.out.println("\nList of Sleep Aids -- Item Status");
        System.out.println("Description" + "\t" + "Found");

        //for each Sleep Aids list item
        for (String saItem : salist) {
            //display the description and the found flag
            System.out.println(saItem);
        }
    }

    private void viewPSList() {
        //get the sorted list of Party Supplies items for the current game
        String[] pslist = new PartySupplies().getPartySuppliesArray();

        System.out.println("\nList of Party Supplies -- Item Status");
        System.out.println("Description" + "\t" + "Found");

        //for each Party Supply list item
        for (String psItem : pslist) {
            //display the description and the found flag
            System.out.println(psItem + "\t   ");
        }
    }
    
    

    private void viewCIList() {
        //get the sorted list of Sleep Aid items for the current game
        String[] cilist = new CakeIngredients().getCakeIngredientsArray();

        System.out.println("\nList of Cake Ingredients -- Item Status");
        System.out.println("Description" + "\t" + "Found");

        //for each Cake Ingredients list item
        for (String ciItem : cilist) {
            //display the description and the found flag
            System.out.println(ciItem + "\t   ");

        
    
        }
    }
}
