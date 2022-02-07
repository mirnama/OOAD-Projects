/*
- name: String
- purchasePrice: float
- listPrice: float
- newOrUsed: Bool
- dayArrived:
- condition: String
-salePrice: float
-daySold:
 */
public class Item {
    private String itemName, itemCondition;
    private Float purchasePrice;
    private Float listPrice, salePrice;



    public Item (String itemName, String itemCondition, Float purchasePrice, Float listPrice, Float salePrice) {
        this.itemName = itemName;
        this.itemCondition = itemCondition;
        this.purchasePrice = purchasePrice;
        this.listPrice = listPrice;
        this.salePrice = salePrice;
    }

    public String getItemName ( ) {
        return itemName;
    }

    public void setItemName (String itemNameSet) {
        this.itemName = itemNameSet;
    }

    public String getItemCondition ( ) {
        return itemCondition;
    }

    public void setItemCondition (String itemConditionSet) {
        this.itemCondition = itemConditionSet;
    }

    public Float getPurchasePrice ( ) {
        return purchasePrice;
    }

    public void setPurchasePrice (Float purchasePriceSet) {
        this.purchasePrice = purchasePriceSet;
    }

    public Float getListPrice ( ) {
        return listPrice;
    }

    public void setListPrice (Float listPriceSet) {
        this.listPrice = listPriceSet;
    }

    public Float getSalePrice ( ) {
        return salePrice;
    }

    public void setSalePrice (Float salePriceSet) {
        this.salePrice = salePriceSet;
    }
}
