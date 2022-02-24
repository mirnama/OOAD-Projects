package Item;

public class Instrument extends ItemDecorator {

    public Instrument(String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice){
        super(itemName,  itemCondition,  purchasePrice,  listPrice,  salePrice);
    }
}
