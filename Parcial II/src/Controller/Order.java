package Controller;
import java.util.*;
import Models.*;


public class Order {
    private List<Product>products=new ArrayList<>();

    public Order(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    double totalprice;
    @Override
    public String toString() {
        return "Order Products List:-+-+-+-+-+-+-+-+-+-+-+-+-+ \n" + products + "Total Cost: $"+totalprice+"\n____________";
    }
    
    
    public void addProduct(Product p){
        products.add(p);
    }

    
    public double calculateTotalOrderValue(){ //■ Recorre todos los productos y suma el total (manejando las excepciones si alguna ocurre).
        double total=0;
        for (Product p : products) {
            try {
                total += p.calculateTotalPrice();
            } catch (Exception e) {
                System.out.println("Error calculating product: " + e.getMessage());
            }
        }
        return total;
    }

    public void showOrderDetails(){     //Muestra los productos y su precio total.
        calculateTotalOrderValue();
        totalprice=calculateTotalOrderValue();
       System.out.println("\nOrder Products List: \n" + products + "\nTotal Cost: $"+totalprice+"\n____________");
    }
    
}
