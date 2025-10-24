package Exceptions;

/*
 * @author: Axel Rincón
 * @version: 1.0
 * This is the Personzalied InvalidSizeException Exception,  throws an Exceptions when the Size Input in a cloth objet is not S,M,L or XL.
 * 
 */


public class InvalidSizeException extends Exception {
    public InvalidSizeException(String mensaje) {
        super(mensaje);
    }
}
