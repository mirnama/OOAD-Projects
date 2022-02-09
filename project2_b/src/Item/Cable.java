public class Cable  extends Accessories {
    private int length;
    public int getLength(){
        return length;
    }
    public void setLength(int newLength){
        length = newLength;
    }
    Cable(int length, String itemName, String itemCondition, Float purchasePrice, Float listPrice, Float salePrice){
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
        this.length = length;

    }
}
