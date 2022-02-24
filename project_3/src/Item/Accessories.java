package Item;

public class Accessories extends ItemDecorator {
    public Accessories(String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice){
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
    }

}
