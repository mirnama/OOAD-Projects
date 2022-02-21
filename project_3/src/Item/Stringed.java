package Item;

public class Stringed extends Instrument {
    private boolean isElectric;

    public Stringed(Boolean isElectric, String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice){
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
        this.isElectric = isElectric;
    }
}
