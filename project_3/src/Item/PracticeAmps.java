package Item;
public class PracticeAmps extends Accessories {
    private int wattage;
    public PracticeAmps(int wattage, String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice){
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
        this.wattage = wattage;
    }
}
