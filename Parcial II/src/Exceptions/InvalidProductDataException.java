package Exceptions;

/*
 * @author: Axel Rincón
 * @version: 1.0
 * This is the Personzalied InvalidProductDataException Exception,  throws an Exceptions when the Data of a product is invalid.
 * 
 */
public class InvalidProductDataException extends Exception {
    public InvalidProductDataException(String mensaje) {
        super(mensaje);
    }
}
