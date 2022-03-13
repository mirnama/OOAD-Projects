package Item.kit;

public class GuitarCover implements KitCompentent{
    private double price;
    private String name;
    public GuitarCover(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
