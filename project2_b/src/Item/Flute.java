package Item;

public class Flute extends Wind {
    private String fluteType;
    public Flute(String fluteType, String itemName, int itemCondition, Float purchasePrice, Float listPrice, Float salePrice){
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
        this.fluteType = fluteType;
    }
    public String GetFluteType(){
        return fluteType;
    }
}
