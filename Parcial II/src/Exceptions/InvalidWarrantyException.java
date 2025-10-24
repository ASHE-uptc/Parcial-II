package Exceptions;

/*
 * @author: Axel Rincón
 * @version: 1.0
 * This is the Personzalied InvalidWarrantyException Exception,  throws an Exceptions when the Warranty of the tech objetc is negative or Zero.
 * 
 */

public class InvalidWarrantyException extends Exception{
    public InvalidWarrantyException(String mensaje) {
        super(mensaje);
    }
}
