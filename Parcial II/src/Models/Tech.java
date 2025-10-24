package Models;

import Exceptions.InvalidWarrantyException;

/*
 * @author: Axel Rincón
 * @version: 1.0
 * This is the Tech Class, that is Son of Product Class, and inherits its methods and attributes.
 * 
 */

public class Tech extends Product{
    private int warrantyMonths;

    public Tech(String pro_name, double pro_price, int pro_stock, int warrantyMonths) {
        super(pro_name, pro_price, pro_stock);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String toString() {
        return "\nTech \nWarranty: " + getWarrantyMonths() +"\nName: " + getPro_name() + "\nPrice: " + getPro_price() + "\nStock: "
                + getPro_stock();
    }

    double price;

    public double calculateTotalPrice() throws InvalidWarrantyException{
        price= pro_price * pro_stock + (pro_price * 0.05 * warrantyMonths);
        if (warrantyMonths < 0) {
            throw new InvalidWarrantyException("Invalid Warranty Exception.");
        }
        return price;
    }

    

}   
