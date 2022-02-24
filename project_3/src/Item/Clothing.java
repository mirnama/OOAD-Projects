package Item;

public class Clothing extends ItemDecorator {
    public Clothing (String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice){
        super( itemName, itemCondition, purchasePrice, listPrice, salePrice);
    }


}
