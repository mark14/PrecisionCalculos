/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package precisioncalculos;

/**
 *
 * @author ich2
 */
class TicketDoesNotExistException  extends Exception { 
    public TicketDoesNotExistException(){
        super();
    }
    
    public TicketDoesNotExistException(String message, Throwable cause) {
        super(message, cause); 
    }
    
    public TicketDoesNotExistException(Throwable cause) {
        super(cause); 
    }


    
}
