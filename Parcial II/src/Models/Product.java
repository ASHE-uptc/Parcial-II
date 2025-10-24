package Models;

/*
 * @author: Axel Rincón
 * @version: 1.0
 * This is the Product Class Father Class of Cloth, Food and Tech.
 * 
 */

public abstract class Product {
    protected String pro_name;
    protected double pro_price;
    protected int pro_stock;

    public Product(String pro_name, double pro_price, int pro_stock) {
        this.pro_name = pro_name;
        this.pro_price = pro_price;
        this.pro_stock = pro_stock;
    }


    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public double getPro_price() {
        return pro_price;
    }

    public void setPro_price(double pro_price) {
        this.pro_price = pro_price;
    }

    public int getPro_stock() {
        return pro_stock;
    }

    public void setPro_stock(int pro_stock) {
        this.pro_stock = pro_stock;
    }

    @Override
    public String toString() {
        return "Product ToString de prueba "+", pro_name=" + pro_name + ", pro_price=" + pro_price + ", pro_stock="
                + pro_stock + "]";
    }

    

    

    
}
