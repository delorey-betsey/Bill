package byui.cit260.youGotNoCake.view;
import java.util.Scanner;

public class CalcBMIMenuView {
    
    private final String BMICALCULATION = "\n"
        +"\n-------------------------------------------------------------------"
        +"\n          CALCULATE BMI"
        +"\n-------------------------------------------------------------------"
        +"\nIn general, BMI is an inexpensive and easy-to-perform method"
        +"\nof screening for weight category, for example underweight, normal"
        +"\nor healthy weight, overweight, and obesity." 
        +"\n-------------------------------------------------------------------";
    
    public void displayMenu() {
    //TODO 
        //rewrite message
        
        char selection = ' ';
        
        System.out.println(BMICALCULATION);  //display the main menu

        int height = this.getHeight();   //get the user's height in inches

        int weight = this.getWeight();   //get the user's weight in lbs.

        double result = this.calcBMI(height,weight);  //calculate BMI based on player input
        
        

        System.out.println("\nYour BMI is:     " 
        + result  //display the calculated BMI"
        + "\n");
        System.out.println("Below 18.5         Underweight"
        + "\n18.5-24.9          Normal or Healthy Weight"
        + "\n25.0-29.9          Overweight"                
        + "\n30.0 and Above     Underweight"
        + "\n");
        System.out.println("\n A one-hour workout is 4% of your day...NO excuses."  
                + "\nContinue your quest...");
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
    
    private int getHeight() {

            boolean valid = false;    //indicates if the choice has been retrieved
            String height = null;
            Scanner keyboard = new Scanner(System.in); //keyboard input stream
            
            //prompt for the player's menu selection
            System.out.println(">>> Enter height in inches between 48 - 96.");

            //get the choice from the keyboard and trim off the blanks

            height = keyboard.nextLine();
            height = height.trim();
            
            //if 'E' the control falls through and returns to Main Menu
            //then checks to validate input is integer
            //then checks for number selection between 1-25
            //if valid, perform doAction
            if (height.charAt(0) != 'E'){
                if (isInteger(height)){
                    //this is creating the new integer variable 'location'
                    //and using a prepackaged function of parseInt from the
                    //the available functions in the Integer class
                    //to see the available functions, type 'Integer.' and hit enter.
                    int h = Integer.parseInt(height);
                    if (h > 47 && h < 97){
                        return h;  //return the valid choice
                    }  
                } else {
                    System.out.println("\n*** Invalid selection *** Try again.");
                }
            }
            return -1;// TODO else return user to locations menu;     
        }
    
    private int getWeight() {

        boolean valid = false;    //indicates if the choice has been retrieved
        String weight = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        //prompt for the player's menu selection
        System.out.println(">>> Enter weight in lbs. between 50-500.");

        //get the choice from the keyboard and trim off the blanks

        weight = keyboard.nextLine();
        weight = weight.trim();

        //if 'E' the control falls through and returns to Main Menu
        //then checks to validate input is integer
        //then checks for number selection between 1-25
        //if valid, perform doAction
        if (weight.charAt(0) != 'E'){
            if (isInteger(weight)){
                //this is creating the new integer variable 'location'
                //and using a prepackaged function of parseInt from the
                //the available functions in the Integer class
                //to see the available functions, type 'Integer.' and hit enter.
                int w = Integer.parseInt(weight);
                if (w > 49 && w < 501){
                    return w;   //return the valid choice
                }  
            } else {
                System.out.println("\n*** Invalid selection *** Try again.");
            }
        }
        return -1;    // TODO return to locations menu     
    }

    public double calcBMI(int height, int weight){
        
            double BMI_MULTIPLIER = 703;

            double result;
            double roundoff;
            roundoff = (weight / Math.pow(height,2) * BMI_MULTIPLIER);
            result = Math.round(roundoff*100)/100;
            return result;
        }
    }


