package Store.Staff.Jobs;

import Store.Obersvables.Logger;
import Store.Store;
import Store.Staff.*;
import Item.Inventory;

import java.util.ArrayList;

public class ArriveAtStore implements Job  {
    private Logger obs = null;
    public ArriveAtStore(Logger o) {
        registerObserver(o);
    }
    public void do_job(Store s, Staff p) {
        System.out.println(p.getEmployeeName()+" arrived.");
        notifyObservers("ArriveAtStore test", s);
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
    public void registerObserver(Logger o) {
        obs = o;
    }
    public void removeObserver(Logger o) {
        obs = null;
    }
    public void notifyObservers(String info, Store s) {
        obs.update(info, s);
    }
    public void setLogger(Logger o) {
        obs = o;
    }
}
