package Item;
public class PracticeAmps extends Accessories {
    private int wattage;
    public PracticeAmps(int wattage, String itemName, String itemCondition, Float purchasePrice, Float listPrice, Float salePrice){
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
        this.wattage = wattage;
    }
}
