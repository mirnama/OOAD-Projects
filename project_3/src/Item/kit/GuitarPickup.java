package Item.kit;

public class GuitarPickup implements KitCompentent {
    private double price;
    private String name;
    public GuitarPickup(String name, double price){
        this.name = name;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
