package Item;

public class Stringed extends Instrument {
    private boolean isElectric;

    public boolean isElectric ( ) {
        return isElectric;
    }

    public void setElectric (boolean electric) {
        isElectric = electric;
    }

    public Stringed(Boolean isElectric, String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice){
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
        this.isElectric = isElectric;
    }
}
