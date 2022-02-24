package Item;

public interface ItemInter {
    public String getItemName ( );
    public void setItemName (String itemNameSet);
    public int getItemCondition ( );
    public void setItemCondition (int itemConditionSet);
    public double getPurchasePrice ( );
    public void setPurchasePrice (double purchasePriceSet);
    public double getListPrice ( );
    public void setListPrice (double listPriceSet);
    public double getSalePrice ( );
    public void setSalePrice (double salePriceSet);
    public boolean isTuned ( );
    public void switchTuned ();
}
