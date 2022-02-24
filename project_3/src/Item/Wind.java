package Item;

public class Wind extends Instrument{
    private Boolean adjusted;
    public Wind(String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice){
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
        this.adjusted = false;
    }
    public boolean isTuned(){return adjusted;}
    public void switchTuned(){
        adjusted = !adjusted;
    }
    public void setTuned(boolean adjusted){this.adjusted = adjusted;}
}
