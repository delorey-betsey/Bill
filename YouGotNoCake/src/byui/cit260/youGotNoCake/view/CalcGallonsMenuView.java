package byui.cit260.youGotNoCake.view;
import java.util.Scanner;

public class CalcGallonsMenuView {
    
    private final String GALLONSCALCULATION = "\n"
        +"\n-------------------------------------------------------------------"
        +"\n          CALCULATE GALLONS FLUSHED PER HOUSEHOUSE PER DAY                      |"
        +"\n-------------------------------------------------------------------"
        +"\nBased on the number of occupants, we will calculate how many"
        +"\ngallons are flushed into waste system by you and your kin.";
    
    public void displayMenu() {
    //TODO 
        //rewrite message
        
        char selection = ' ';
        
        System.out.println(GALLONSCALCULATION);  //display the main menu

        int members = this.getMembers();   //get the user's household number

        double result = this.calcGallons(members);  //calculate gallons flushed based on user input
        
        System.out.println("\nYour household waste water in gallons per day from flushing is :     " 
                + result  //display the calculated gallons"
        );
        System.out.println ("\nNo wonder it doesn’t smell very good down here."
        + "Continue your quest...");
        System.out.println(
       "\n======================================================================"); 
    
 }
 
    private static boolean isInteger(String x) {
        try { 
            Integer.parseInt(x); 
        } catch(NumberFormatException | NullPointerException e) { 
            return false; 
        }
        // only got here if we didn't return false
        return true;
    }
    
    private int getMembers() {

            boolean valid = false;    //indicates if the choice has been retrieved
            String members = null;
            Scanner keyboard = new Scanner(System.in); //keyboard input stream
            
            //prompt for the player's menu selection
            System.out.println(">>> Enter number of people in your household.");

            //get the choice from the keyboard and trim off the blanks

            members = keyboard.nextLine();
            members = members.trim();
            
            //if 'E' the control falls through and returns to Main Menu
            //then checks to validate input is integer
            //then checks for number selection between 1-25
            //if valid, perform doAction
            if (members.charAt(0) != 'E'){
                if (isInteger(members)){
                    //this is creating the new integer variable 'location'
                    //and using a prepackaged function of parseInt from the
                    //the available functions in the Integer class
                    //to see the available functions, type 'Integer.' and hit enter.
                    int m = Integer.parseInt(members);
                    if (m >0 && m < 51){
                        return m;  //return the valid choice
                    }  
                } else {
                    System.out.println("\n*** Invalid selection *** Try again.");
                }
            }
            return -1;// TODO else return user to locations menu;     
        }
    
    public double calcGallons(int members){

        double FLUSHES_PER_PERSON = 5;
        double GALLONS_PER_FLUSH = 3.5;
        double result;
        result = members * FLUSHES_PER_PERSON * GALLONS_PER_FLUSH;
        return result;
        }
    }

