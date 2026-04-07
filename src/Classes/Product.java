package Classes;

public abstract class Product {
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
        if (quantity >= 0){
            this.quantity = quantity;
        }else{
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
    }

    public abstract double getPrice();
}
