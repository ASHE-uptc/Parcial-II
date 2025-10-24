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
        for (Product p : products) {
            totalprice+=p.getPro_price();
        }
        return totalprice;
    }

    public void showOrderDetails(){     //Muestra los productos y su precio total.
        calculateTotalOrderValue();
        totalprice=totalprice;
       System.out.println("\nOrder Products List: \n" + products + "\nTotal Cost: $"+totalprice+"\n____________");
    }
    
}
