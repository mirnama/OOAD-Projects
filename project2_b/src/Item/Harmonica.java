package Item;

public class Harmonica extends Wind{
    private String harmonicaKey;
    Harmonica(String harmonicaKey,String itemName, int itemCondition, Float purchasePrice, Float listPrice, Float salePrice){
        super (itemName, itemCondition, purchasePrice, listPrice, salePrice);
        this.harmonicaKey = harmonicaKey;
    }
    public String getHarmonicaKey() {
        return harmonicaKey;
    }
}
