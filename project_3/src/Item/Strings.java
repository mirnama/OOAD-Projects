package Item;

public class Strings extends Accessories {
    private String type;
    public String getType() {
        return type;
    }
    public void setType(String newType){
        type = newType;
    }
    public Strings(String type, String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice){
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
        this.type = type;
    }
}
