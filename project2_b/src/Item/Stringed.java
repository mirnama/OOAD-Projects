package Item;

public class Stringed extends Instrument{
    private boolean isElectric;
    public Stringed(Boolean isElectric, String itemName, String itemCondition, Float purchasePrice, Float listPrice, Float salePrice){
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
        this.isElectric = isElectric;
    }
}
