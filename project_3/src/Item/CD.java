package Item;

public class CD extends Music{
    public CD (String itemName, int itemCondition, Float purchasePrice, Float listPrice, Float salePrice, String band, String album) {
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice, band, album);
    }

    public CD (String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice) {
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
    }

}
