/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.exception;

/**
 *
 * @author brnlow
 */
public class CalcGallonsException extends Exception{
    
    public CalcGallonsException() {
        super();
    }
    
    public CalcGallonsException(String msg) {
         super(msg);
    }
    
    public CalcGallonsException(String msg, Exception ex) {
         super(msg,ex);
    }
     
    public CalcGallonsException(Exception ex) {
          super(ex);
    }
}
