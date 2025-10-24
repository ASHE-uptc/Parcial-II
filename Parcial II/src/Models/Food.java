package Models;
import java.time.*;
import java.time.LocalDate;
import java.util.*;

/*
 * @author: Axel Rincón
 * @version: 1.0
 * This is the Food Class, Son of Product Class, and inherits its methods and attributes.
 * 
 */

import Exceptions.InvalidWarrantyException;

public class Food extends Product{
    LocalDate Food_expirationDate;

    public Food(String pro_name, double pro_price, int pro_stock, LocalDate food_expirationDate) {
        super(pro_name, pro_price, pro_stock);
        Food_expirationDate = food_expirationDate;
    }

    public LocalDate getFood_expirationDate() {
        return Food_expirationDate;
    }

    public void setFood_expirationDate(LocalDate food_expirationDate) {
        Food_expirationDate = food_expirationDate;
    }

    @Override
    public String toString() {
        return "Food \nExpiration Date: " + getFood_expirationDate() +"\nName: " + getPro_name() + "\nPrice: " + getPro_price() + "\nStock: "
                + getPro_stock();
    }
    double totalprice;
    List<Product>products=new ArrayList<>();
    public double calculateTotalPrice(){
        for (Product p : products) {
            totalprice+=(p.getPro_price()*getPro_stock());
        }
        return totalprice;
    }
}

