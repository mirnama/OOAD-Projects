package Item.Decorator;

import Item.Item;

public class OptionalSaleDecorator extends Item {
    protected Item decoratedItem;
    public OptionalSaleDecorator(){}

    public String getItemName ( ) {
        return decoratedItem.getItemName();
    }
    public void setItemName (String itemNameSet) { // I put set in the end to now which one the new var just a style we could change it
        decoratedItem.setItemName(itemNameSet);
    }
    public int getItemCondition ( ) {
        return decoratedItem.getItemCondition();
    }
    public void setItemCondition (int itemConditionSet) { // I put set in the end to now which one the new var just a style we could change it
        decoratedItem.setItemCondition(itemConditionSet);
    }
    public double getPurchasePrice ( ) {
        return decoratedItem.getPurchasePrice();
    }

    @Override
    public void setPurchasePrice (double purchasePriceSet) {

    }
    public void setPurchasePrice (Float purchasePriceSet) {
        decoratedItem.setPurchasePrice(purchasePriceSet);
    }
    public double getListPrice ( ) {
        return decoratedItem.getListPrice();
    }
    @Override
    public void setListPrice (double listPriceSet) {

    }
    public void setListPrice (Float listPriceSet) {
        decoratedItem.setListPrice(listPriceSet);
    }
    public double getSalePrice ( ) {
        return decoratedItem.getSalePrice();
    }
    @Override
    public void setSalePrice (double salePriceSet) {

    }
    public void setSalePrice (Float salePriceSet) {
        decoratedItem.setSalePrice(salePriceSet);
    }

}
