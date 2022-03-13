package Item.kit;

public class GuitarBridge implements KitCompentent {
    private double price;
    private String name;
    public GuitarBridge(String name, Double price) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}
