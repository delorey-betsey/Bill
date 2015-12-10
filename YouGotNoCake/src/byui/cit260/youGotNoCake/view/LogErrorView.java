/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.view;

import yougotnocake.YouGotNoCake;

/**
 *
 * @author brnlow
 */
public class LogErrorView {
    
    public static void logError(String className, String err) {
        String logMessage = "\n===================================================\n"
                           +"   "+ err + " occurred in " + className +"\n"
                           +"===================================================";
        YouGotNoCake.getLogFile().print(logMessage);
        YouGotNoCake.getLogFile().flush();
    }
    
}
