package Store.Staff.Jobs;

import Item.Inventory;
import Store.Obersvables.Logger;
import Store.Store;
import Store.Staff.*;

public class DoInventory implements Job {
    private Logger obs = null;

    public DoInventory(Logger o) {
        registerObserver(o);
    }
    public void do_job(Store s, Staff p) {
        Inventory inventory = s.getInventory();
        boolean found = false;
        boolean ordered = false;
        String className = "";
        int countOrders = 0;

        for(String subtype : inventory.getClassNames()) {
            found = inventory.subtypeExists(subtype);
            ordered = false;
            //if class name is not found we place an order for an item of that class
            if (!found){
                for (int j = 0; j < inventory.getOrders().size(); j++){
                    className = inventory.getOrders().get(j).getClass().getName();
                    if(className.equals(subtype)){
                        ordered = true;
                    }
                }
                //creates and runs PlaceAnOrder Job
                if(!ordered) {
                    new PlaceAnOrder(obs).do_job(s, p, subtype); // +3 of that type
                    countOrders += 3;
                }
            }
        }
        notifyObservers(inventory.getMerchandise().size()+" items in inventory.");
        notifyObservers("$"+inventory.sumPurchasePrice()+" sum purchase price in inventory.");
        notifyObservers(countOrders+" orders placed.");

    }
    public void registerObserver(Logger o) {
        obs = o;
    }
    public void removeObserver(Logger o) {
        obs = null;
    }
    public void notifyObservers(String info) {
        obs.update(info);
    }
    public void setLogger(Logger o) {
        obs = o;
    }
}