package Item.kit;

public class GuitarKnobSet implements KitCompentent {
    private String name;
    private double price;
    public GuitarKnobSet(String name, double price){
        this.price = price;
        this.name = name;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getName() {
        return name;
    }
}
