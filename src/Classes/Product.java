package Classes;

public class Product {
    private int id;
    private String name;
    private int quantity;
    private double basePrice;

    public Product(int id, String name, int quantity, double basePrice){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
