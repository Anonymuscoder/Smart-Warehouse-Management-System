package Classes;

public class Electronics extends Product{
    private int wattage;
    private String warranty;

    public Electronics(int id, String name, int quantity, double basePrice, int wattage, String warranty) {
        super(id, name, quantity, basePrice);
        this.wattage = wattage;
        this.warranty = warranty;
    }

    public double getPrice(){
        return getBasePrice();
    }

}
