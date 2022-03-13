package Item.kit;

public class GuitarPickGuard implements KitCompentent{
    private double price;
    private String name;
    public GuitarPickGuard(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
