package Item;

public class Cable extends Accessories {
    private int length;
    public Cable(int length, String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice){
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
        this.length = length;
    }

    public int getLength(){
        return length;
    }
    public void setLength(int newLength){
        length = newLength;
    }
}
