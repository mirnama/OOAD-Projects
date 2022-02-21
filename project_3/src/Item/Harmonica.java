package Item;

public class Harmonica extends Wind{
    private String harmonicaKey;

    public Harmonica(String harmonicaKey, String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice){

        super (itemName, itemCondition, purchasePrice, listPrice, salePrice);
        this.harmonicaKey = harmonicaKey;
    }
    public String getHarmonicaKey() {
        return harmonicaKey;
    }
}
