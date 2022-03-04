package Item;

public class Player extends Item {
    private boolean equalized;


    public Player (String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice) {
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
    }

    public boolean isTuned ( ) {
        return equalized;
    }

    public void switchTuned () {
        equalized = !equalized;
    }
    public void setTuned(boolean equalized){this.equalized = equalized;}
}
