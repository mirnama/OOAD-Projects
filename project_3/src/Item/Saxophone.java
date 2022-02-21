package Item;

//new Wind Instrument subclass,theSaxophone.

public class Saxophone extends Wind{
    private String saxophoneType;
    public Saxophone (String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice) {
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
    }

    public String getSaxophoneType ( ) {
        return saxophoneType;
    }

    public void setSaxophoneType (String saxophoneType) {
        this.saxophoneType = saxophoneType;
    }
}
