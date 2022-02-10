package Item;

public class Shirt extends Clothing {
    private int shirtSize;
    Shirt(int shirtSize,String itemName, String itemCondition, Float purchasePrice, Float listPrice, Float salePrice){
        super(itemName,  itemCondition,  purchasePrice,  listPrice,  salePrice);
        this.shirtSize = shirtSize;
    }
    public void setShirtSize(int shirtSize){
        this.shirtSize = shirtSize;
    }
    public int getShirtSize() {
        return shirtSize;
    }
}