///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package byui.cit260.youGotNoCake.view;
//
//import java.util.Scanner;
//
////public class GameMenuView {
//
//public class GameMenuView extends View {
//        
//    public GameMenuView () {
//        super ("\n"
//        +"\n----------------------------------"
//        +"\n| Game Menu                      |"
//        +"\n----------------------------------"
//        +"\nL - Choose a location."
//        +"\nS - Save game."
//        +"\nE - Exit"
//        +"\n----------------------------------");
//    }
//
//    @Override
//    public boolean doAction(Object obj){
//        String value = (String) obj; 
//        value = value.toUpperCase(); //convert to all upper case
//        char choice = value.charAt(0);
//        switch (choice){
//            case 'L': //display goal of game
//                this.chooseLocation();
//                break;
//            case 'S': //display how to move
//                this.saveGame();
//                break;
//            case 'E': //exit the program
//                return false;
//            default:
//                System.out.println("\n*** Invalid selection *** Try again.");
//        }
//        return false;
//    }
//    
//    private void saveGame() {
//        System.out.println("*** saveGame function called ***");    
//    }
//    
//    private String chooseLocation() {
//        System.out.println("*** chooseLocation function called ***");    
//        //prompt for player choice of location and pass to locationMenuView
//         
//        boolean valid = false;    //indicates if the name has been retrieved
//        String playersChoice = null;
//        Scanner keyboard = new Scanner(System.in); //keyboard input stream
//        
//        while(!valid) {    //while a valid choice has not been retrieved
//            
//            //prompt for the player's choice
//            System.out.println("Enter game map.");
//            
//            //get the choice from the keyboard and trim off the blanks
//            playersChoice = keyboard.nextLine();
//            playersChoice = playersChoice.trim();
//            
//            // if the choice is invalid (less than two characters in length)
//            if (playersChoice.length() < 2 || playersChoice.length() > 2){
//                System.out.println("Invalid choice - indicate location with two digits");
//            }else{
//                break; //out of the repetition (exit)
//            }
//        }
//    return playersChoice;     //return the choice
//    }
//    
//}
