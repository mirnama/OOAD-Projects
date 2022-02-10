package Item;

public class Stringed extends Instrument{
    private boolean isElectric;
    Stringed(Boolean isElectric, String itemName, int itemCondition, Float purchasePrice, Float listPrice, Float salePrice){
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
        this.isElectric = isElectric;
    }
}
