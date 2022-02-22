package Store.Staff.Jobs;

import Item.Inventory;
import Store.Store;
import Store.Staff.*;

public class DoInventory extends Job {
    public void do_job(Store s, Staff p) {
        Inventory inventory = s.getInventory();
        boolean found = false;
        boolean ordered = false;
        String className = "";

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
                    new PlaceAnOrder().do_job(s, p, subtype);
                }
            }
        }
    }
}