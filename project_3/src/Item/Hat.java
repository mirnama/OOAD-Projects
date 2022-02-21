package Item;

public class Hat extends Clothing{
    private int hatSize;

    public Hat(int hatSize, String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice){
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
        this.hatSize = hatSize;
    }

    public int getHatSize(){
        return hatSize;
    }
    public void setHatSize(int hatSize){
        this.hatSize = hatSize;
    }
}
