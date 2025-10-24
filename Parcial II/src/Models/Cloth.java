package Models;

public class Cloth extends Product{
    private String Cloth_size;

    public Cloth(String pro_name, double pro_price, int pro_stock, String cloth_size) {
        super(pro_name, pro_price, pro_stock);
        Cloth_size = cloth_size;
    }

    public String getCloth_size() {
        return Cloth_size;
    }

    public void setCloth_size(String cloth_size) {
        Cloth_size = cloth_size;
    }

    @Override
    public String toString() {
        return "\nCloth \nSize: " + getCloth_size() +"\nName: " + getPro_name() + "\nPrice: " + getPro_price() + "\nStock: "
                + getPro_stock();
    }

    public void calculateTotalPrice(){
        /*○ Si el producto está vencido, lanza una excepción ExpiredProductException.
        ○ Si no está vencido, retorna basePrice * quantity * 0.9 (10% de descuento).*/
    }
    

}
