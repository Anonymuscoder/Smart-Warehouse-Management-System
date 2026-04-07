package Classes;

public class perishable extends Product{
    private String localDate;
    private String expiryDate;

    public perishable(int id, String name, int quantity, double basePrice, String localDate, String expiryDate){
        super(id, name, quantity, basePrice);
        this.localDate = localDate;
        this.expiryDate = expiryDate;
    }
}
