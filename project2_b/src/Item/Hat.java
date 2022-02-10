package Item;

public class Hat extends Clothing{
    private int hatSize;
    public Hat(int hatSize,String itemName, String itemCondition, Float purchasePrice, Float listPrice, Float salePrice){
        super (itemName, itemCondition, purchasePrice, listPrice, salePrice);
        this.hatSize = hatSize;
    }
    public int getHatSize(){
        return hatSize;
    }
    public void setHatSize(int hatSize){
        this.hatSize = hatSize;
    }
}
