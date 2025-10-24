package Exceptions;

/*
 * @author: Axel Rincón
 * @version: 1.0
 * This is the Personzalied ExpiredProductException Exception,  throws an Exceptions when the expiration ate date input its before the realExpiration date.
 * 
 */
public class ExpiredProductException extends Exception {
    public ExpiredProductException(String mensaje) {
        super(mensaje);
    }
}
