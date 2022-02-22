package Store.Staff.Jobs;

import Store.Store;
import Store.Staff.*;
import Item.Inventory;

public class ArriveAtStore extends Job  {
    public void do_job(Store s, Staff p) {
        Inventory inventory = s.getInventory();

        s.getWorkingStaff().add(p);
        System.out.println(p.getEmployeeName() + " arrives at the store on day " + s.getDayCount());
        for (int i=0; i<inventory.getOrders().size(); i++) {
            if (inventory.getOrders().get(i).getReceiveDate()==s.getDayCount()) {
                System.out.println(inventory.getOrders().get(i).getItem().getItemName()+" came into store.");
                inventory.getMerchandise().add(inventory.getOrders().get(i).getItem());
                inventory.getOrders().remove(i);
                i--;
            }
        }
    }
}
