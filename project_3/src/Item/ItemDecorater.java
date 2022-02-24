package Item;

import Store.Obersvables.Logger;

import javax.swing.text.Utilities;

public abstract class ItemDecorater implements ItemInter {
    private String itemName;
    private int itemCondition;
    private double purchasePrice;
    private double listPrice, salePrice;

    public ItemDecorater ( ) {

    }

    public ItemDecorater (String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice) {
        this.itemName = itemName;
        this.itemCondition = itemCondition;
        this.purchasePrice = purchasePrice;
        this.listPrice = listPrice;
        this.salePrice = salePrice;
    }

    @Override
    public String getItemName ( ) {
        return itemName;
    }

    @Override
    public void setItemName (String itemName) {
        this.itemName = itemName;
    }

    @Override
    public int getItemCondition ( ) {
        return itemCondition;
    }

    @Override
    public void setItemCondition (int itemCondition) {
        this.itemCondition = itemCondition;
    }

    @Override
    public double getPurchasePrice ( ) {
        return purchasePrice;
    }

    @Override
    public void setPurchasePrice (double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    @Override
    public double getListPrice ( ) {
        return listPrice;
    }

    @Override
    public void setListPrice (double listPrice) {
        this.listPrice = listPrice;
    }

    @Override
    public double getSalePrice ( ) {
        return salePrice;
    }

    public void setSalePrice (double salePrice) {
        this.salePrice = salePrice;
    }
}
