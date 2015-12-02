package byui.cit260.youGotNoCake.view;
import java.util.Scanner;

public class CalcXmasMenuView {
    
    private final String XMASCALCULATION = 
         "\n-------------------------------------------------------------------"
        +"\n          CALCULATE DAYS UNTIL CHRISTMAS 2015                      "
        +"\n-------------------------------------------------------------------"
        +"\nWe will calculate the number of days from today to Dec 25, 2015!"
         +"\n-------------------------------------------------------------------";
    
    public void displayMenu() {
    //TODO 
        //rewrite message
        
        char selection = ' ';
        
        System.out.println(XMASCALCULATION);  //display the main menu

        int day = this.getDay();   //get the user's day

        int month = this.getMonth();   //get the user's month

        double result = this.calcXmas(day,month);  //calculate days to Xmas based on player input
        
//TODO        if (result <=0) {
//            System.out.println("Silly, you missed it! Date after Christmas.");
//        } else {
        System.out.println("\nDays to Christmas 2015:   " 
        + result  //display the calculated days to Christmas"
        );
        System.out.println("Hope you're bein' nice! Continue your quest...");
        System.out.println(
       "\n======================================================================");   
//        }
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
    
    
    private int getDay() {

            boolean valid = false;    //indicates if the choice has been retrieved
            String day = null;
            Scanner keyboard = new Scanner(System.in); //keyboard input stream
            
            //prompt for the player's menu selection
            System.out.println(">>> Enter today's day, one or two digits day between 1 and 31.");

            //get the choice from the keyboard and trim off the blanks

            day = keyboard.nextLine();
            day = day.trim();
            
            //if 'E' the control falls through and returns to Main Menu
            //then checks to validate input is integer
            //then checks for number selection between 1-25
            //if valid, perform doAction
            if (day.charAt(0) != 'E'){
                if (isInteger(day)){
                    //this is creating the new integer variable 'location'
                    //and using a prepackaged function of parseInt from the
                    //the available functions in the Integer class
                    //to see the available functions, type 'Integer.' and hit enter.
                    int d = Integer.parseInt(day);
                    if (d > 0 && d < 32){
                        return d;  //return the valid choice
                    }  
                } else {
                    System.out.println("\n*** Invalid selection *** Try again.");
                }
            }
            return -1;// TODO else return user to locations menu;     
        }
    
    private int getMonth() {

            boolean valid = false;    //indicates if the choice has been retrieved
            String month = null;
            Scanner keyboard = new Scanner(System.in); //keyboard input stream
            
            //prompt for the player's menu selection
            System.out.println(">>> Enter today's month, one or two digits month between 1 and 12.");

            //get the choice from the keyboard and trim off the blanks

            month = keyboard.nextLine();
            month = month.trim();
            
            //if 'E' the control falls through and returns to Main Menu
            //then checks to validate input is integer
            //then checks for number selection between 1-25
            //if valid, perform doAction
            if (month.charAt(0) != 'E'){
                if (isInteger(month)){
                    //this is creating the new integer variable 'location'
                    //and using a prepackaged function of parseInt from the
                    //the available functions in the Integer class
                    //to see the available functions, type 'Integer.' and hit enter.
                    int m = Integer.parseInt(month);
                    if (m > 0 && m < 13){
                        return m;  //return the valid choice
                    }  
                } else {
                    System.out.println("\n*** Invalid selection *** Try again.");
                }
            }
            return -1;// TODO else return user to locations menu;     
        }

    public double calcXmas(int day, int month){
    
        double XMAS_2015_julian = 2457381.5;
        double  todaysJulian;
        double  result;
        
        //Find today's Julian date
        double a = 2015/100;
        double b = a/4;
        double c = 2 - a + b;
        double e = 365.25 * (2015 + 4716);
        double f = 30.6001 * (month + 1);
        todaysJulian = c + day + e + f - 1524.5;
        
        //Find days between today and Christmas
        
        double roundoff = XMAS_2015_julian - todaysJulian;
        result = Math.round(roundoff*100)/100;
        return result;
        }
    }


 
