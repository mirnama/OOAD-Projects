package Item;

public class Flute extends Wind {
    private String fluteType;
    public Flute(String fluteType, String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice){
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
        this.fluteType = fluteType;
    }
    public String GetFluteType(){
        return fluteType;
    }
}
