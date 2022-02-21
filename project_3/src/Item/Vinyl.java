package Item;

public class Vinyl extends Music{
    public Vinyl (String itemName, int itemCondition, Float purchasePrice, Float listPrice, Float salePrice, String band, String album) {
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice, band, album);
    }

    public Vinyl (String itemName, int itemCondition, Float purchasePrice, Float listPrice, Float salePrice) {
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
    }
}
