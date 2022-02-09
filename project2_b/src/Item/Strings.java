public class Strings extends Accessories {
    private String type;
    public String getType() {
        return type;
    }
    public void setType(String newType){
        type = newType;
    }
    Strings(String type, String itemName, String itemCondition, Float purchasePrice, Float listPrice, Float salePrice){
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
        this.type = type;
    }
}
