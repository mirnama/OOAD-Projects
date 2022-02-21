package Item;
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
/*
 * Items are:
 *Music(band,album){Paper Score, CD, Vinyl}
 * Players {CD, Record Player, MP3}
 * Instruments:
 * Stringed (electric){Guitar, Bass, Mandolin}
 * Wind Flute (type)
 * Harmonica (key)
 * Clothing:
 * Hats (hatSize)
 * Shirts (shirtSize)
 * Bandanas
 *Accessories:
 *Practice Amps (wattage)
 * Cables (length)
 * Strings (type)
 */
public class Item {
    private String itemName;
    private int itemCondition;
    private double purchasePrice;
    private double listPrice, salePrice;

    public Item (String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice) {
        this.itemName = itemName;
        this.itemCondition = itemCondition;
        this.purchasePrice = purchasePrice;
        this.listPrice = listPrice;
        this.salePrice = salePrice;
    }

    public String getItemName ( ) {
        return itemName;
    }
    public void setItemName (String itemNameSet) { // I put set in the end to now which one the new var just a style we could change it
        this.itemName = itemNameSet;
    }
    public int getItemCondition ( ) {
        return itemCondition;
    }
    public void setItemCondition (int itemConditionSet) { // I put set in the end to now which one the new var just a style we could change it
        this.itemCondition = itemConditionSet;
    }
    public double getPurchasePrice ( ) {
        return purchasePrice;
    }
    public void setPurchasePrice (Float purchasePriceSet) {
        this.purchasePrice = purchasePriceSet;
    }
    public double getListPrice ( ) {
        return listPrice;
    }
    public void setListPrice (Float listPriceSet) {
        this.listPrice = listPriceSet;
    }
    public double getSalePrice ( ) {
        return salePrice;
    }
    public void setSalePrice (Float salePriceSet) {
        this.salePrice = salePriceSet;
    }
}
