package Store;

import Item.ItemDecorator;

public class OptionalSales extends ItemDecorator {
    public OptionalSales (String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice) {
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
    }
}
