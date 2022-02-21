package Item;

public class Player extends Item{
    private boolean equalized;

    {
        equalized = false;
    }

    public Player (String itemName, int itemCondition, double purchasePrice, double listPrice, double salePrice) {
        super(itemName, itemCondition, purchasePrice, listPrice, salePrice);
    }

    public boolean isEqualized ( ) {
        return equalized;
    }

    public void setEqualized (boolean equalized) {
        this.equalized = equalized;
    }
}
